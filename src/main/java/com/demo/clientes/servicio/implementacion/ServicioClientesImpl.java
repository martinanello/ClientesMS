package com.demo.clientes.servicio.implementacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.clientes.dao.RepositorioCliente;
import com.demo.clientes.modelo.Cliente;
import com.demo.clientes.modelo.KpiCliente;
import com.demo.clientes.modelo.ListaClientes;
import com.demo.clientes.servicio.ServicioClientes;

@Service
public class ServicioClientesImpl implements ServicioClientes
{

   @Autowired
   RepositorioCliente repoCliente;
   private final int expectativaVida = 80;

   @Override
   public void crearCliente( Cliente cliente )
   {
      repoCliente.save( cliente );
   }

   @Override
   public KpiCliente getKpiClientes()
   {
      Iterator< Cliente > it = listarClientes();
      int sum = 0;

      List< Integer > valores = new ArrayList< Integer >();

      while( it.hasNext() )
      {
         int edad = it.next()
                      .getEdad();
         valores.add( edad );
         sum += edad;
      }
      float promedio = sum / valores.size();

      double varianza = 0.0;
      double desviacion = 0.0;

      for( int i = 0; i < valores.size(); i++ )
      {
         double rango;
         rango = Math.pow( valores.get( i ) - promedio,
                           2f );
         varianza += rango;
      }
      varianza = varianza / valores.size();
      desviacion = Math.sqrt( varianza );

      return new KpiCliente( promedio,
                             desviacion );
   }

   @Override
   public ListaClientes getListaClientes()
   {
      List< Cliente > list = new ArrayList< Cliente >();
      Iterator< Cliente > it = listarClientes();
      while( it.hasNext() )
      {
         Cliente cl = it.next();
         
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(cl.getFechaNacimiento());
         calendar.add(Calendar.YEAR, expectativaVida);
         cl.setProbableMuerte( calendar.getTime() );
         
         list.add( cl );
      }
      ListaClientes listaClientes = new ListaClientes();
      listaClientes.setListaClientes( list );

      return listaClientes;
   }

   private Iterator< Cliente > listarClientes()
   {
      return repoCliente.findAll()
                        .iterator();
   }

}

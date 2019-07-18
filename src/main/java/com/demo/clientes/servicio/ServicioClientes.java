package com.demo.clientes.servicio;

import com.demo.clientes.modelo.Cliente;
import com.demo.clientes.modelo.KpiCliente;
import com.demo.clientes.modelo.ListaClientes;

public interface ServicioClientes
{

   public void crearCliente( Cliente cliente );

   public KpiCliente getKpiClientes();

   public ListaClientes getListaClientes();
}

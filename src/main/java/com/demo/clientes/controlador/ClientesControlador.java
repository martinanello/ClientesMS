package com.demo.clientes.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.clientes.modelo.Cliente;
import com.demo.clientes.servicio.implementacion.ServicioClientesImpl;

@Controller
public class ClientesControlador
{

   @Autowired
   ServicioClientesImpl servicio;

   @RequestMapping( "/" )
   public String home()
   {
      return "home.jsp";
   }

   @PostMapping( "/creacliente" )
   @ResponseBody
   public ModelAndView creacliente( Cliente cliente )
   {
      servicio.crearCliente( cliente );
      ModelAndView mv = new ModelAndView( "clientecreado.jsp" );
      mv.addObject( "cliente",
                    cliente );
      return mv;
   }

   @GetMapping( "/kpideclientes" )
   @ResponseBody
   public ModelAndView kpideclientes()
   {
      ModelAndView mv = new ModelAndView( "kpideclientes.jsp" );
      mv.addObject( "kpi",
                    servicio.getKpiClientes() );
      return mv;
   }

   @GetMapping( "/listclientes" )
   @ResponseBody
   public ModelAndView listclientes()
   {
      ModelAndView mv = new ModelAndView( "listclientes.jsp" );
      mv.addObject( "listaClientes",
                    servicio.getListaClientes().getListaClientes() );
      return mv;
   }
}

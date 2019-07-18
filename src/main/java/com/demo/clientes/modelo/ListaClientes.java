package com.demo.clientes.modelo;

import java.util.List;

public class ListaClientes
{

   private List< Cliente > listaClientes;

   public List< Cliente > getListaClientes()
   {
      return listaClientes;
   }

   public void setListaClientes( List< Cliente > listaClientes )
   {
      this.listaClientes = listaClientes;
   }

   @Override
   public String toString()
   {
      return "ListaClientes [listaClientes=" + listaClientes + "]";
   }

}

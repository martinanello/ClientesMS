package com.demo.clientes.modelo;

public class KpiCliente
{

   private float  promedio;
   private double desviacion;

   public KpiCliente( float promedio,
                      double desviacion )
   {
      super();
      this.promedio = promedio;
      this.desviacion = desviacion;
   }

   public float getPromedio()
   {
      return promedio;
   }

   public void setPromedio( float promedio )
   {
      this.promedio = promedio;
   }

   public double getDesviacion()
   {
      return desviacion;
   }

   public void setDesviacion( double desviacion )
   {
      this.desviacion = desviacion;
   }

   @Override
   public String toString()
   {
      return "KpiCliente [promedio=" + promedio + ", desviacion=" + desviacion + "]";
   }

}

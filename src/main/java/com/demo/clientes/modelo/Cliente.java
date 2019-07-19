package com.demo.clientes.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Cliente
{

   @Id
   //      @GeneratedValue
   private long   id;
   private String nombre;
   private String apellido;
   private int    edad;
   @DateTimeFormat( pattern = "MM-dd-yyyy" )
   private Date   fechaNacimiento;
   private Date   probableMuerte;

   public Cliente()
   {

   }

   public Cliente( long id,
                   String nombre,
                   String apellido,
                   int edad,
                   Date fechaNacimiento,
                   Date probableMuerte )
   {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
      this.fechaNacimiento = fechaNacimiento;
      this.probableMuerte = probableMuerte;
   }

   public long getId()
   {
      return id;
   }

   public void setId( long id )
   {
      this.id = id;
   }

   public String getNombre()
   {
      return nombre;
   }

   public void setNombre( String nombre )
   {
      this.nombre = nombre;
   }

   public String getApellido()
   {
      return apellido;
   }

   public void setApellido( String apellido )
   {
      this.apellido = apellido;
   }

   public int getEdad()
   {
      return edad;
   }

   public void setEdad( int edad )
   {
      this.edad = edad;
   }

   public Date getFechaNacimiento()
   {
      return fechaNacimiento;
   }

   public void setFechaNacimiento( Date fechaNacimiento )
   {
      this.fechaNacimiento = fechaNacimiento;
   }

   public Date getProbableMuerte()
   {
      return probableMuerte;
   }

   public void setProbableMuerte( Date probableMuerte )
   {
      this.probableMuerte = probableMuerte;
   }

   @Override
   public String toString()
   {
      return "Cliente [id=" +
             id +
             ", nombre=" +
             nombre +
             ", apellido=" +
             apellido +
             ", edad=" +
             edad +
             ", fechaNacimiento=" +
             fechaNacimiento +
             ", probableMuerte=" +
             probableMuerte +
             "]";
   }

}

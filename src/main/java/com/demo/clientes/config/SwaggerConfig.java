package com.demo.clientes.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig
{
   @Bean
   public Docket api()
   {
      return new Docket( DocumentationType.SWAGGER_2 ).select()
                                                      .apis( RequestHandlerSelectors.basePackage( "com.demo.clientes.controlador" ) )
                                                      .paths( PathSelectors.any() )
                                                      .build()
                                                      .apiInfo( apiInfo() );
   }

   private static ApiInfo apiInfo()
   {
      return new ApiInfo( "ClientesMS API",
                          "API de Clientes en Spring Boot con interfaz JSP y base de datos en memoria.\nExisten 4 registros de clientes precargados (Id 1 al 4)",
                          "V1.0",
                          "Terminos de Servicio",
                          new Contact( "Martin Anello",
                                       "",
                                       "martinanello@gmail.com" ),
                          "Licencia de API",
                          "URL de licencia",
                          Collections.emptyList() );
   }
}

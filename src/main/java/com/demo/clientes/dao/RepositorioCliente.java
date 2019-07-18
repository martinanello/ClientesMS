package com.demo.clientes.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.clientes.modelo.Cliente;

public interface RepositorioCliente extends CrudRepository< Cliente, Long >
{

}

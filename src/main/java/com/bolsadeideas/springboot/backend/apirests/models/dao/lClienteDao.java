package com.bolsadeideas.springboot.backend.apirests.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirests.models.entity.Cliente;

public interface lClienteDao extends CrudRepository <Cliente,Long> {

}

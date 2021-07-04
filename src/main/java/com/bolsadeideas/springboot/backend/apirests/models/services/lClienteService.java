package com.bolsadeideas.springboot.backend.apirests.models.services;

import com.bolsadeideas.springboot.backend.apirests.models.entity.Cliente;
import java.util.List;

public interface lClienteService {

	public List<Cliente>findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
	
	
	
	
}

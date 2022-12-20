package com.trabalhodac.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhodac.crm.model.Usuario;
import com.trabalhodac.crm.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	@PostMapping("/criaUsuario")
	public Usuario criaUsuario(@RequestBody Usuario usuario) {
		return service.criaUsuario(usuario);
	}

}
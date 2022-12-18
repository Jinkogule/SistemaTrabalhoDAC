package com.trabalhodac.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	/*----------------REQUISIÇÕES GET----------------*/
	/*-------PÚBLICAS-------*/
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    
    
    @GetMapping("/inscricoes")
    public String inscricoes() {
        return "inscricoes.html";
    }
    
    @GetMapping("/chamada")
    public String chamada() {
        return "chamada.html";
    }
    
    @GetMapping("/programacao")
    public String programacao() {
        return "programacao.html";
    }
    
    @GetMapping("/cadastro-usuario")
    public String telaCadastroUsuario() {
        return "/cadastro-usuario.html";
    }
    
    
    
    
    
    /*-------ADMINISTRADOR-------*/
    @GetMapping("/home-administrador")
    public String home_administrador() {
        return "/administrador/home.html";
    }
    
    @GetMapping("/cadastro-edicao")
    public String telaCadastroEdicao() {
        return "/admin/cadastro-edicao.html";
    }
    
    @GetMapping("/cadastro-evento")
    public String telaCadastroEvento() {
        return "/admin/cadastro-evento.html";
    }
    
    @GetMapping("/edicao-evento")
    public String telaEdicaoEvento(int id) {
        return "/admin/edicao-evento.html";
    }
    
    @GetMapping("/remocao-edicao")
    public String telaRemocaoEdicao(int id) {
        return "/admin/edicao-evento.html";
    }
    
    @GetMapping("/remocao-evento")
    public String telaRemocaoEvento(int id) {
        return "/admin/remocao-evento.html";
    }
    
    /*-------ORGANIZADOR-------*/
    @GetMapping("/home-organizador")
    public String home_organizador() {
        return "/organizador/home.html";
    }
    
    @GetMapping("/cadastro-atividade")
    public String telaCadastroAtividade() {
        return "/organizador/cadastro-atividade.html";
    }
    
    @GetMapping("/cadastro-espaco")
    public String telaCadastroEspaco() {
        return "/organizador/cadastro-espaco.html";
    }
    
    @GetMapping("/edicao-atividade")
    public String telaEdicaoAtividade(int id) {
        return "/organizador/edicao-atividade.html";
    }
    
    @GetMapping("/edicao-edicao")
    public String telaEdicaoEdicao(int id) {
        return "/organizador/edicao-edicao.html";
    }
    
    @GetMapping("/edicao-espaco")
    public String telaEdicaoEspaco(int id) {
        return "/organizador/edicao-espaco.html";
    }
    
    @GetMapping("/remocao-atividade")
    public String telaRemocaoAtividade(int id) {
        return "/organizador/remocao-atividade.html";
    }
    
    @GetMapping("/remocao-espaco")
    public String telaRemocaoEspaco(int id) {
        return "/organizador/remocao-espaco.html";
    }
    
    /*-------USUARIO-------*/
    @GetMapping("/home-usuario")
    public String home_usuario() {
        return "/usuario/home.html";
    }

}
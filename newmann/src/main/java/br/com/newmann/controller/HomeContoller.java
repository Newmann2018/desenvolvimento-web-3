package br.com.newmann.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeContoller {
	@GetMapping
	public String index(){
		return "Sejá Bem Vindo ao Mundo de GTA 5 ";
	}

}

package com.APICadastroDePets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.APICadastroDePets.Model.CadastroDePets;
import com.APICadastroDePets.Service.CadastroDePetsService;



@Controller
@RequestMapping("/CadastroDePets")
public class CadastrosdepetsController {
	@Autowired
	private CadastroDePetsService cadastrodePetsservice;
	private Object resultCadastroDePets; 
	
	@GetMapping("/forminsert")
    public String insert(Model model){
		CadastroDePets cadastrodepets = new CadastroDePets();
		model.addAttribute("cadastrodepets",cadastrodepets);
		return "cadastrodepets/insert";
	}
	@GetMapping("/list")
    public String list(Model model) {
        List<CadastroDePets> cadastrodepets = cadastrodePetsservice.findAll();
        model.addAttribute("cadastrodepets", cadastrodepets);
        return "cadastrodepets/list";
    }
	@PostMapping("/insert")
    public String insert(@ModelAttribute("cadastrodepets") CadastroDePets cadastrodepets) {
		CadastroDePets resultCadastroDePets = cadastrodePetsservice.insert(cadastrodepets);
        if (resultCadastroDePets != null) {
            return "cadastrodepets/success";
        }
        return "cadastrodepets/error";
    }
}

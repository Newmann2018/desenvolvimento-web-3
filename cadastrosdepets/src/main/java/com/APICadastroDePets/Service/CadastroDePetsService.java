package com.APICadastroDePets.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APICadastroDePets.Model.CadastroDePets;
import com.APICadastroDePets.repository.CadastroDePetsRepository;


@Service
public class CadastroDePetsService {
	@Autowired
	private static CadastroDePetsRepository cadastroDePetsRepository;
	
	public static CadastroDePets insert(CadastroDePets cadastrodepets){
		return cadastroDePetsRepository.save(cadastrodepets);
	}
	public CadastroDePets update(CadastroDePets objCadastroDePets) {
        return cadastroDePetsRepository.save(objCadastroDePets);
    }
	public List<CadastroDePets> findAll() {
        List<CadastroDePets> cadastrodepets = new ArrayList<>();
        cadastroDePetsRepository.findAll().forEach(cadastrodepets::add);
        return cadastrodepets;
    }
	public Optional<CadastroDePets> findOne(Integer id) {
        return cadastroDePetsRepository.findById(id);
    }
	public void remove(Integer id) {
		cadastroDePetsRepository.deleteById(id);
    }
}

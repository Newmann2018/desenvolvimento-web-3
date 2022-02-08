package com.APICadastroDePets.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.APICadastroDePets.Model.CadastroDePets;

@Repository
public interface CadastroDePetsRepository extends CrudRepository<CadastroDePets, Integer> {

	

}

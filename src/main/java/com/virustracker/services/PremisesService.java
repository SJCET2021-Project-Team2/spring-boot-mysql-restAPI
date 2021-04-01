package com.virustracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virustracker.entity.Premises;
import com.virustracker.repository.PremisesRepository;

@Service
public class PremisesService {
	
	@Autowired
	private PremisesRepository premisesRepository;

	public Iterable<Premises> getAllPremises() {
		return premisesRepository.findAll();
	}

	public void addNewPremises(Premises premises) {
		premisesRepository.save(premises);
	}

	public Premises getPremises(Integer id) {
		return premisesRepository.findById(id).orElseGet(null);
	}

	public void updatePremises(Integer id, Premises premises) {
		premisesRepository.save(premises);
	}

	public void deletePremises(Integer id) {
		premisesRepository.deleteById(id);
	}
	
}

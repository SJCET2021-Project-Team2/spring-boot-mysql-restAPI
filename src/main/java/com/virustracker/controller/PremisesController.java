package com.virustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.Premises;
import com.virustracker.services.PremisesService;

@RestController
@RequestMapping(path = "/premises")
public class PremisesController {

	@Autowired
	private PremisesService premisesService;
	
//	GET REQUEST
	@RequestMapping(path = "/all")
	public Iterable<Premises> getAllPremises(){
		return premisesService.getAllPremises();
	}
	
//  GET REQUEST
	@RequestMapping("/{id}")
	public Premises getPremises(@PathVariable Integer id) {
		return premisesService.getPremises(id);
	}
	
//	POST REQUEST
	@RequestMapping(method = RequestMethod.POST, path = "/register")
	public void addNewPremises(@RequestBody Premises premises) {
		premisesService.addNewPremises(premises);
	}
	
//	PUT REQUEST
	@RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")
	public void updatePremises(@PathVariable Integer id, @RequestBody Premises premises) {
		premisesService.updatePremises(id, premises);
	}
	
//	DELETE REQUEST
	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public void deletePremises(@PathVariable Integer id) {
		premisesService.deletePremises(id);
	}
}

package com.system.gym.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.system.gym.models.Gym;
import com.system.gym.repository.GymRepository;

@RestController
@RequestMapping("/api")
public class GymController {
	
	@Autowired
	private GymRepository gymRepository; 
	
	@GetMapping
	public List<Gym> list(){
		//List<Gym> gymList = new ArrayList<>();
		//return gymList;
		return gymRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Gym gym) {
		gymRepository.save(gym);
	}
	
	@GetMapping("/{id}")
	public Gym get(@PathVariable("id") long id) {
		//return new Gym();
		return gymRepository.getOne(id);
	}
	
	
}

package com.film.actor.Actorfilm;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(" /api/actor")
public class ActorCon {

	
	@Autowired
	private ActorService as;
	
	@PostMapping 
	public ResponseEntity<Actor> createFilm(@RequestBody Film film){
		
		Actor actor = null;
		Actor createdFilm = as.createActor(actor);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdFilm);
		
	}
	
	
	@GetMapping
	public ResponseEntity<Page >getAllActor(
	@RequestParam(defaultValue=" 0") int page,
	@RequestParam(defaultValue=" 10") int size,
	@RequestParam(defaultValue=" id") String sortBy){
		
	Pageable pg =PageRequest.of(page, size, Sort.by(sortBy))	;
		
	}
	
	
	)
	

	
}

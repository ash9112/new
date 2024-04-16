package com.film.actor.Actorfilm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(" /api/film")
public class FilmCon {
	
	@Autowired
	private FilmService fs;
	
	@PostMapping 
	public ResponseEntity<Film> createFilm(@RequestBody Film film){
		
		Film createdFilm = fs.createFilm(film);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdFilm);
		
	}
	
	
	public ResponseEntity<Page<Film> > getAllFilm(
			
			@RequestParam(defaultValue = " 0")int page;
			@Requestparam(defaultValue = " 10 ") int size;)
		
	{
		
		
		Pageable pagable = PageRequest
		
	}
			
			
			
			)

}

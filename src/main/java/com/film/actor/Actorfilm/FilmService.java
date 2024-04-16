package com.film.actor.Actorfilm;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import net.sf.jsqlparser.statement.update.Update;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepo f;
	
	public Film createFilm(Film film) {
		return f.save(film);
		
	}
	
		public  Page<Film> getAllFilm(Pageable p) {
			return f.findAll(p);
			
		
	}

		public  Optional<Film> getFilmById(Integer id) {
			return f.findById(id);
			
		
	}

		
		public  Film updateFilm(Integer id , Update Film) {
			return f.updated(id);
			
		
	}
		
		
		public  void deleteFilm(Film id) {
			 f.delete(id);
			
		
	}

}

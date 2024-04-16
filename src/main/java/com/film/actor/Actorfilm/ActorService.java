package com.film.actor.Actorfilm;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import net.sf.jsqlparser.statement.update.Update;

@Service
public class ActorService {
	
		
		@Autowired
		private ActorRepo a;
		
		public Actor createActor(Actor actor) {
			return a.save(actor);
			
		}
		
			public  Page<Actor> getAllActor(Pageable p) {
				return a.findAll(p);
				
			
		}

			public  Optional<Actor> getActorById(Integer id) {
				return a.findById(id);
				
			
		}

			
			public  Actor updateActor(Integer id , Update Actor) {
				return a.updated(id);
				
			
		}
			
			
			public  void deleteActor(Integer id) {
				 a.delete(id);
				
			
		}

	}




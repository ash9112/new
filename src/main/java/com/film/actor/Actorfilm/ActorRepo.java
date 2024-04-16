package com.film.actor.Actorfilm;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepo extends JpaRepository<Actor , Integer> {

	Page<Actor> findAll(Pageable p);

	void delete(Integer id);

	Actor updated(Integer id);

}

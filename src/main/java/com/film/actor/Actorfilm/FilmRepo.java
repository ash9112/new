package com.film.actor.Actorfilm;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo  extends JpaRepository<Film , Integer> {

	Page<Film> findAll(Pageable p);

	Film updated(Integer id);

}

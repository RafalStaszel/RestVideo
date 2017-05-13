package com.kaos.repository;

import org.springframework.data.repository.CrudRepository;
import com.kaos.model.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
	 Film findByTitleIgnoreCase(String title);
	 Film findById(int id);
	 Film removeByTitleIgnoreCase(String title);
	;

}

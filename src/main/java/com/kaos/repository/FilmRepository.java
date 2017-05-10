package com.kaos.repository;

import org.springframework.data.repository.CrudRepository;
import com.kaos.video.model.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
	// Film findByTitle(String title);

}

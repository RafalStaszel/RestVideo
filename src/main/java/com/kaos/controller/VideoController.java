package com.kaos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kaos.repository.FilmRepository;
import com.kaos.video.model.Film;

@Controller
@RequestMapping(path = "/videoBaza")
public class VideoController {

	@Autowired
	private FilmRepository filmRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String addNewFilm(@RequestParam String title) {

		Film film = new Film();
		film.setTitle(title);
		film.setAvaible(true);
		filmRepository.save(film);
		return "Movie saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}
}

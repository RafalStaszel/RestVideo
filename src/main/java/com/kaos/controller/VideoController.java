package com.kaos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kaos.model.Film;
import com.kaos.repository.FilmRepository;

@Controller
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private FilmRepository filmRepository;

	@GetMapping("/add")
	public @ResponseBody String addNewFilm(@RequestParam String title) {

		Film film = new Film();
		film.setTitle(title);
		film.setAvaible(true);
		filmRepository.save(film);
		return "Movie saved";
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/findTitle/{title}")
	public @ResponseBody Film findByTitle(@PathVariable String title) {
		return filmRepository.findByTitleIgnoreCase(title);
	}

	@GetMapping("/findId/{id}")
	public @ResponseBody Film findById(@PathVariable int id) {
		return filmRepository.findById(id);
	}

	@GetMapping("/avaible/{avaible}/{id}")
	public @ResponseBody String setAvaible(@PathVariable boolean avaible, @PathVariable int id) {
		filmRepository.findById(id).setAvaible(avaible);
		return "Movie " + filmRepository.findById(id).getTitle() + " set avaible " + avaible;

	}

	@GetMapping("/test")
	public @ResponseBody String answer() {
		return "Yes, server - ON";
	}

}

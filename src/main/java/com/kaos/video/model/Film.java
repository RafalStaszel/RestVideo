package com.kaos.video.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private boolean avaible;

	public Film(int id, String title) {
		this.id = id;
		this.title = title;
		avaible = true;
	}

	public Film(String title) {
		this.title = title;
		avaible = true;

	}

	public Film() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvaible() {
		return avaible;
	}

	public void setAvaible(boolean avaible) {
		this.avaible = avaible;
	}

}

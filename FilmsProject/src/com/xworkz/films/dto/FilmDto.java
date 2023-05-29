package com.xworkz.films.dto;

public class FilmDto {

	private String filmName;
	private Long budget;
	private String actorName;
	private String actressName;
	private Integer noOfCoActors;

	public FilmDto() {
		System.out.println("No args Constuctor");
	}

	public FilmDto(String filmName, Long budget, String actorName, String actressName, Integer noOfCoActors) {
		super();
		this.filmName = filmName;
		this.budget = budget;
		this.actorName = actorName;
		this.actressName = actressName;
		this.noOfCoActors = noOfCoActors;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public Integer getNoOfCoActors() {
		return noOfCoActors;
	}

	public void setNoOfCoActors(Integer noOfCoActors) {
		this.noOfCoActors = noOfCoActors;
	}

	@Override
	public String toString() {
		return "FilmDto [filmName=" + filmName + ", budget=" + budget + ", actorName=" + actorName + ", actressName="
				+ actressName + ", noOfCoActors=" + noOfCoActors + "]";
	}

}

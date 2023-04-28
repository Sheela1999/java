package com.xworkz.movies.dto;

public class MovieDto {
	
	private String movieName;
	private String actorName;
	private String actressName;
	private long budget;
	private int noOfCoactrors;

	public MovieDto(String movieName, String actorName, String actressName, long budget, int noOfCoactrors) {
		super();
		this.movieName = movieName;
		this.actorName = actorName;
		this.actressName = actressName;
		this.budget = budget;
		this.noOfCoactrors = noOfCoactrors;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
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

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public int getNoOfCoactrors() {
		return noOfCoactrors;
	}

	public void setNoOfCoactrors(int noOfCoactrors) {
		this.noOfCoactrors = noOfCoactrors;
	}

	@Override
	public String toString() {
		return "MovieDto [movieName=" + movieName + ", actorName=" + actorName + ", actressName=" + actressName
				+ ", budget=" + budget + ", noOfCoactrors=" + noOfCoactrors + "]";
	}
	
	

}

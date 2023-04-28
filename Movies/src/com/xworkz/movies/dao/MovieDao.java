package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MovieDto;

public class MovieDao {

	MovieDto[] movies = new MovieDto[5];

	public boolean saveMovie(MovieDto dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			if (dto.getMovieName() != null && dto.getActorName() != null && dto.getActressName() != null
					&& dto.getBudget() != 0) {
				System.out.println("The given variables are valid");

				if (dto.getMovieName().length() > 3 && dto.getActorName().length() > 4) {
					System.out.println("The given name is having space");

					for (int i = 0; i < movies.length; i++) {
						if (movies[i] == null) {
							movies[i] = dto;
							System.out.println("The movie name is saved successfully");
							return true;
						}
					}
				}
				System.out.println("There is no enough space");
				return false;
			}
			System.out.println("the given variables are not valid");
			return false;
		}
		System.out.println("dto is null , check dto");
		return false;
	}

	public MovieDto[] readAllMovies() {
		return movies;
	}

}

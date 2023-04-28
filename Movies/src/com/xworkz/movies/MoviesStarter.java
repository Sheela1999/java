package com.xworkz.movies;

import com.xworkz.movies.dao.MovieDao;
import com.xworkz.movies.dto.MovieDto;

public class MoviesStarter {

	public static void main(String[] args) {

		MovieDto dto = new MovieDto("DADA", "Kavin", "Aparna Das", 1000000l, 30);

		MovieDto dto1 = new MovieDto("SitaRaman", "Dulqar Salman", "Murnal", 2000000l, 50);

		MovieDto dto2 = new MovieDto("Kanthara", "Rishab Shetty", "sapthami gowda", 3000000l, 200);

		MovieDao dao = new MovieDao();

		dao.saveMovie(dto);

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		dao.saveMovie(dto1);

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		dao.saveMovie(null);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		dao.saveMovie(dto2);

		System.out.println("--------------------------------------------------------------------------------------");

		MovieDto[] result = dao.readAllMovies();

		for (int i = 0; i <= result.length - 1; i++) {
			if (result[i] != null) {
				System.out.println(result[i]);
			}

		}
	}
}

package com.xworkz.films.dao;

import com.xworkz.films.custom.DeleteValueNotFoundException;
import com.xworkz.films.custom.DtoNullException;
import com.xworkz.films.custom.NullPointerException;
import com.xworkz.films.custom.NoSpaceArrayException;
import com.xworkz.films.custom.UpdateValueIsNull;
import com.xworkz.films.dto.FilmDto;

public interface FilmDao {
	
	public abstract boolean save(FilmDto dto) throws NoSpaceArrayException, DtoNullException;
	public abstract FilmDto[] find(Integer noOfCoActors) throws NullPointerException;
	public abstract boolean update(Long budget, String actressName) throws UpdateValueIsNull;
	public abstract boolean delete(String actorName) throws DeleteValueNotFoundException;
	public abstract FilmDto[] readAll();

}

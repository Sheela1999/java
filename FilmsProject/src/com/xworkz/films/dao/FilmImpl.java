package com.xworkz.films.dao;

import com.xworkz.films.custom.DeleteValueNotFoundException;
import com.xworkz.films.custom.DtoNullException;
import com.xworkz.films.custom.NullPointerException;
import com.xworkz.films.custom.NoSpaceArrayException;
import com.xworkz.films.custom.UpdateValueIsNull;
import com.xworkz.films.dto.FilmDto;

public class FilmImpl implements FilmDao {
	
	FilmDto[] dtos = new FilmDto[5];

	@Override
	public boolean save(FilmDto dto) throws NoSpaceArrayException , DtoNullException {
		if(dto != null) {
			if(dto.getFilmName() != null) {
				if(dto.getFilmName().length()>3) {
					for(int i=0; i<dtos.length; i++) {
						if(dtos[i] == null) {
							dtos[i] = dto;
							System.out.println("Film Name dto is saved");
							return true;
						}
					}
					throw new NoSpaceArrayException("Array is not having enough space");
				}
				return false;
			}
		}
		throw new DtoNullException("dto is null");
	}

	@Override
	public FilmDto find(Integer noOfCoActors) throws NullPointerException  {
		if(noOfCoActors <= 500) {
			for(int i=0; i<dtos.length; i++) {
				if(dtos[i] != null) {
					if(dtos[i].getNoOfCoActors() .equals(noOfCoActors)) {
						System.out.println("no of actors found");
						return dtos[i];
					}
				}
			}
			throw new NullPointerException("Array Index is null");
		}
		System.out.println(" Length is Not valid");
		return null;
	}

	@Override
	public boolean update(Long budget, String actressName) throws UpdateValueIsNull {
		if(actressName!=null && actressName.length()>4) {
			if(budget <= 1000000000) {
				for(int i=0; i<dtos.length; i++) {
					if(dtos[i] != null) {
						if(dtos[i].getBudget().equals(budget)) {
							dtos[i].setActressName(actressName);
							System.out.println("Actress name is updated Successfully");
							return true;
						}
						
						System.out.println("searching budget is not found, so name is not updated");
					}
				}
				return false;
			}
			return false;
		}
		throw new UpdateValueIsNull("updating value is null");
	}

	public boolean delete(String dltActorName) throws DeleteValueNotFoundException {
		if(dltActorName != null) {
			if(dltActorName.length()>=4) {
			  for(int i=0; i<dtos.length; i++) {
				  if(dtos[i] != null) {
					  if(dtos[i].getActorName().equals(dltActorName)) {
						  dtos[i] = null;
						  System.out.println("Actor name is deleted");
						  return true;
					  }
					  System.out.println("Actor name is not found");
				  }
			  }
			  return false;
			}
			return false;
		}
		throw new DeleteValueNotFoundException("Deletting value is null");
	}
	
	@Override
	public FilmDto findByTwoFields(String actressName, Long budget) throws NullPointerException {
		if(actressName != null && budget >= 500000000l) {
			if(actressName.length()>3) {
				for(int i=0; i<dtos.length; i++) {
					if(dtos[i] != null) {
						if(dtos[i].getActressName().equals(actressName)) {
							if(dtos[i].getBudget().equals(budget)) {
								System.out.println("two fiels are found");
								return dtos[i];
							}
						}
					}
				}
				return null;
			}
		}
		throw new NullPointerException("given value is null");
	}

	@Override
	public boolean updateByTwoFields(String actorName, Integer noOfCoActors, String filmName) throws UpdateValueIsNull {
		if(filmName != null && actorName != null) {
			if(noOfCoActors >= 100) {
				for(int i=0; i<dtos.length; i++) {
					if(dtos[i] != null) {
						if(dtos[i].getActorName().equals(actorName)) {
							//if(dtos[i].getNoOfCoActors().equals(noOfCoActors)) {
								dtos[i].setFilmName(filmName);
								System.out.println("Name is updated");
								return true;
							//}
							//System.out.println("no of co actors not found");
						}
						System.out.println("name not found");
					}
					System.out.println("index value is null");
				}
				return false;
			}
			return false;
		}
		throw new UpdateValueIsNull("updating value is null");
	}

	@Override
	public FilmDto[] readAll() {
		return dtos;
	}

}

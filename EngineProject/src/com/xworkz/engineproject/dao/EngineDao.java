package com.xworkz.engineproject.dao;

import com.xworkz.engineproject.custom.ArrayOutOfBoundException;
import com.xworkz.engineproject.custom.CapacityIsNullException;
import com.xworkz.engineproject.custom.DtoIsNullException;
import com.xworkz.engineproject.custom.TypeIsNullException;
import com.xworkz.engineproject.dto.EngineDto;

public interface EngineDao {
	
	public abstract boolean save(EngineDto dto) throws ArrayOutOfBoundException, DtoIsNullException;
	public abstract EngineDto[] readAll();
	public abstract EngineDto Find(String type);
	public abstract boolean update(int noOfCylinders, String capacity) throws CapacityIsNullException;
	public abstract boolean delete(String type) throws TypeIsNullException;

}

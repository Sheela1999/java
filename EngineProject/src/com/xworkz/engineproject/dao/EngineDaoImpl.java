package com.xworkz.engineproject.dao;

import com.xworkz.engineproject.custom.ArrayOutOfBoundException;
import com.xworkz.engineproject.custom.CapacityIsNullException;
import com.xworkz.engineproject.custom.DtoIsNullException;
import com.xworkz.engineproject.custom.TypeIsNullException;
import com.xworkz.engineproject.dto.EngineDto;

public class EngineDaoImpl implements EngineDao {

	EngineDto[] dtos = new EngineDto[5];

	public boolean save(EngineDto dto) throws ArrayOutOfBoundException, DtoIsNullException {
		if (dto != null) {
			if (dto.getEngineName() != null && dto.getEngineName().length() >= 4) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] == null) {
						dtos[i] = dto;
						System.out.println("dto is saved");
						return true;
					}
					System.out.println("The Index " + i + " Is Not Null Moving To Next Index i++");
				}
				throw new ArrayOutOfBoundException("Array Dont Have Enough Sapce");
			}
			System.out.println("Given name is not valid");
			return false;
		}
		throw new DtoIsNullException("Dto Is Null");
	}
	
	public EngineDto[] readAll() {
		return dtos;
	}

	public EngineDto Find(String type) {
		if (type != null) {
			if (type.length() > 5) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] != null) {
						if (dtos[i].getType().equals(type)) {
							System.out.println("searching type is found");
							return dtos[i];
						}
					}
				}
				return null;
			}
			return null;
		}
		throw new NullPointerException("type is null");
	}

	public boolean update(int noOfCylinders, String capacity) throws CapacityIsNullException {
		if (noOfCylinders <= 50) {
			if (capacity != null && capacity.length() >= 3) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] != null) {
						if (dtos[i].getNoOfCylinders() == noOfCylinders) {
							dtos[i].setCapacity(capacity);
							System.out.println("value is updated");
							return true;
						}
						System.out.println("noOfCylinders is not found in " + i + " th indext moving to next one");
					}
				}
				System.out.println("Array index is null");
				return false;

			}
			throw new CapacityIsNullException("capacity is null");
		}
		return false;
	}

	public boolean delete(String type) throws TypeIsNullException {
		if (type != null) {
			if (type.length() > 3) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] != null) {
						if (dtos[i].getType().equals(type)) {
							dtos[i] = null;
							System.out.println("The type Is deleted");
							return true;
						}
						System.out.println("type is not found in" + i + " th index");
					}
				}
				return false;
			}
			System.out.println("The type length is not valid");
			return false;
		}

		throw new TypeIsNullException("Type Is Null");

	}

}

package com.xworkz.engineproject;

import com.xworkz.engineproject.custom.ArrayOutOfBoundException;
import com.xworkz.engineproject.custom.CapacityIsNullException;
import com.xworkz.engineproject.custom.DtoIsNullException;
import com.xworkz.engineproject.custom.TypeIsNullException;
import com.xworkz.engineproject.dao.EngineDao;
import com.xworkz.engineproject.dao.EngineDaoImpl;
import com.xworkz.engineproject.dto.EngineDto;

public class EngineRunner {

	public static void main(String[] args) {

		EngineDto dto = new EngineDto("gasoline engine", "Articulated", "11.9liters", 6, 10000, "Fuel Injection", 5400);
		EngineDto dto1 = new EngineDto("Wankel engine", "4 Stroke In Line", "14.10liters", 5, 20000, "Direct Injection",
				6000);

		EngineDao dao = new EngineDaoImpl();

		try {
			dao.save(dto);
			dao.Find("Articulated");
			dao.update(6, "20.10liters");
			dao.delete("4 Stroke In Line");

		} catch (ArrayOutOfBoundException e) {
			e.printStackTrace();

		} catch (DtoIsNullException e) {
			e.printStackTrace();

		} catch (CapacityIsNullException e) {
			e.printStackTrace();

		} catch (NullPointerException e) {
			e.printStackTrace();

		} catch (TypeIsNullException e) {
			e.printStackTrace();
		}

		EngineDto[] reading = dao.readAll();
		for (int i = 0; i < reading.length; i++) {
			if (reading[i] != null) {
				System.out.println(reading[i]);

			}

		}

	}

}

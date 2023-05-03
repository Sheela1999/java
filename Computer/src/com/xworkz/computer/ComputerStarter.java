package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDao;
import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;
import com.xworkz.computer.dto.constants.ComputerType;

public class ComputerStarter {

	public static void main(String[] args) {
		
		ProcessorDto obj = new ProcessorDto("Intel Core", "6th generation", "Intel i6");
		
		ProcessorDto obj1 = new ProcessorDto("Intel Core2", "5th generation", "Intel i5");
		
		ProcessorDto obj2 = new ProcessorDto("Intel Core3", "3th generation", "Intel i3");
		
		ProcessorDto obj3 = new ProcessorDto("Intel Core4", "4th generation", "Intel i4");
		
		ProcessorDto obj4 = new ProcessorDto("IntelC", "10th generation", "Intel i10");
		
	
		ComputerDto dto = new ComputerDto("Hp", "Intel" ,"Gray", 31000, obj, ComputerType.MAC);
		
		ComputerDto dto1 = new ComputerDto("Dell", "Intel2" ,"Black", 50000, obj1, ComputerType.PC);
		
		ComputerDto dto2 = new ComputerDto("Asus", "Intel3" ,"white", 39000, obj2, ComputerType.COMPUTER);
		
		ComputerDto dto3 = new ComputerDto("Lenevo", "Intel4" ,"Silver", 49000, obj3, ComputerType.NOTEBOOK);
		
		ComputerDao dao = new ComputerDao();
		
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(null);
		
		System.out.println("----------------------------------------------------------------");
		
		dao.findByBrand("Hp");
		dao.findByModel("Intel2");
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		dao.updateModelByBrand("Hp", "Intel1");
		dao.updateProcessorByBrand("Dell", obj4);
		
		System.out.println("---------------------------------------------------------------------------");
		
		dao.deleteByColor("white");
		dao.deleteByBrand("Lenevo");
		
		System.out.println("----------------------------------------------------------------------------");
		
		ComputerDto[] result = dao.readAll();
		
		for (int i=0; i<result.length; i++) {
			if(result[i] != null) {
				System.out.println(result[i]);
			}
		}

	}

}

package com.xworkz.bankproject.dao;

import com.xworkz.bankproject.customexception.DtoNullException;
import com.xworkz.bankproject.customexception.InvalidYearException;
import com.xworkz.bankproject.customexception.NameNotFoundException;
import com.xworkz.bankproject.customexception.NoSpaceArrayException;
import com.xworkz.bankproject.customexception.NotUpadetedEcxeption;
import com.xworkz.bankproject.dto.BankDto;

public class BankDao {

	BankDto[] banks = new BankDto[10];

	public boolean save(BankDto dto) throws DtoNullException, NoSpaceArrayException {
		if (dto != null) {
			if (dto.getBankName() != null && dto.getBankName().length() > 4 && dto.getBranch() != null
					&& dto.getType() != null) {
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] == null) {
						banks[i] = dto;
						System.out.println("Bank name is saved in dto");
						return true;
					}
				}
				throw new NoSpaceArrayException("Array is not have Space");
			}
			System.out.println("Bank name is not valid");
			return false;
		}
		throw new DtoNullException("Dto is null");
	}

	public BankDto[] readAll() {
		return banks;
	}

	public boolean find(String name) throws NameNotFoundException {
		if (name != null && name.length() > 4) {
			for (int i = 0; i < banks.length; i++) {
				if (banks[i] != null) {
					if (banks[i].getBankName().equals(name)) {
						System.out.println("Searching Name is Found");
						return true;
					}
					throw new NameNotFoundException("Searching name is not found");
				}
			}
			System.out.println("Searching name is not matching");
			return false;
		}
		System.out.println("name is null");
		return false;
	}

	public boolean update(String type, String branch) throws NotUpadetedEcxeption {
		if (type != null && branch != null) {
			if (type.length() > 3 && branch.length() > 3) {
				for (int i = 0; i < banks.length; i++) {
					if (banks[i] != null) {
						if (banks[i].getType().equals(type)) {
							banks[i].setBranch(branch);
							System.out.println("Branch is updated Successfully");
							return true;
						}
						throw new NotUpadetedEcxeption("Branch is not updated");
					}
				}
				return false;
			}
			System.out.println("type and brach length is not valid for update");
			return false;
		}
		System.out.println("type and brachs are null");
		return false;
	}

	public boolean delete(int dltYear) throws InvalidYearException {
		if (dltYear <= 2000) {
			for (int i = 0; i < banks.length; i++) {
				if (banks[i] != null) {
					if (banks[i].getYearOfEstablishment() == dltYear) {
						banks[i] = null;
						System.out.println("Established year is deleted successfully");
						return true;
					}
				}
			}
			return false;
		}
		throw new InvalidYearException("deleting year is not valid");
	}

}

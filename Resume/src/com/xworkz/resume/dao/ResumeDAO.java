package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDTO;

public class ResumeDAO {

	ResumeDTO[] resume = new ResumeDTO[10];

	public boolean saveResume(ResumeDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			if (dto.getName() != null && dto.getFatherName() != null && dto.getDateOfBirth() != null
					&& dto.getDegree() != null && dto.getPhoneNumber() != 0 && dto.getEmail() != null
					&& dto.getDegree() != null) {
				System.out.println("The given Variables are valid");

				if (dto.getName().length() >= 3 && dto.getFatherName().length() >= 2) {
					System.out.println("The length is valid");

					for (int i = 0; i < resume.length; i++) {
						if (resume[i] == null) {
							resume[i] = dto;
							System.out.println("The name is saved successfully");
							return true;
						}
						System.out.println("The name is not saved");
					}
					System.out.println("name is not valid");
					return false;
				}
				System.out.println("the length is not valid");
				return false;
			}
			System.out.println("The Given variables are not valid");
			return false;
		}
		System.out.println("dto is null, check dto");
		return false;
	}

	public ResumeDTO[] readResume() {
		return resume;
	}

	public boolean findByName(String name) {
		if (name != null) {
			if (name.length() > 3) {

				for (int i = 0; i < resume.length; i++) {
					if (resume[i] != null) {

						resume[i].getName().equals(name);
						System.out.println("name found");
						return true;
					}

				}
				System.out.println("sarching name not found, i++");
				return false;
			}
			System.out.println("length is less than 3");
			return false;

		}
		System.out.println("name is null");
		return false;
	}

	public boolean findByEmail(String email) {
		if (email != null) {
			if (email.length() >= 8) {

				for (int i = 0; i < resume.length; i++) {
					if (resume[i] != null) {

						resume[i].getEmail().equals(email);
						System.out.println("email found");
						return true;
					}

				}
				System.out.println("mail not found");
				return false;

			}
			System.out.println("length is less than 7");
			return false;

		}
		System.out.println("email is null");
		return false;
	}

	public boolean updateDegreeByName(String name, String degree) {
		if (name != null) {
			System.out.println("The given name is valid");
			if (degree != null) {
				if (degree.length() <= 7) {
					System.out.println("The given degree length is valid");

					for (int i = 0; i < resume.length; i++) {
						if (resume[i] != null) {
							if (resume[i].getName().equals(degree)) {
								resume[i].setDegree(degree);
								System.out.println("Degree updated successfully");
								return true;
							}
							System.out.println("The degree is not updated");
						}

					}
					System.out.println("The index space is not enough");
					return false;

				}
				System.out.println("The given degree length  is not valid");
				return false;

			}
			System.out.println("The given degree is null");
			return false;

		}
		System.out.println("The name is null");
		return false;
	}

	public boolean updatePhoneNumberByEmail(String email, long phoneNumber) {
		if (email != null) {
			if (phoneNumber != 0) {

				for (int i = 0; i < resume.length; i++) {
					if (resume[i] != null) {
						resume[i].getEmail().equals(email);
						resume[i].setPhoneNumber(phoneNumber);
						System.out.println("phone number is updated successfully");
						return true;
					}
					System.out.println("phone number not updated");
				}
				System.out.println("email is not found");
				return false;
			}
			System.out.println("updating phone number is 0");
			return false;
		}
		System.out.println("updating email is null");
		return false;
	}

	public boolean deleteByName(String dltName) {
		if (dltName != null) {

			for (int i = 0; i < resume.length; i++) {
				if (dltName.equals(dltName)) {
					dltName = null;

					System.out.println("Deleted Successfully");
					return true;
				}

			}
			System.out.println("name is not found");
			return false;

		}
		System.out.println("deleted name is null");
		return false;
	}
}

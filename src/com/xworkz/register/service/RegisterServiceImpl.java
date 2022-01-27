package com.xworkz.register.service;

import javax.persistence.PersistenceException;

import com.xworkz.register.dao.RegisterDao;
import com.xworkz.register.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {
	private RegisterDao dao;
	public RegisterServiceImpl(RegisterDao registerDao) {
		this.dao = registerDao;
	}

	@Override
	public boolean validateAndSave(RegisterEntity regEntity) {
		boolean valid = false;

		try {
			if (regEntity.getUserName().length() < 6 || regEntity.getUserName().length() > 25
					|| regEntity.getUserName() == null) {
				valid = false;
				System.out.println("userName is invalid");
				return false;
			} else {
				valid = true;
				System.out.println("UserName is valid");
			}
			if (regEntity.getEmailId() == null || regEntity.getEmailId().isEmpty() == true
					|| (!(regEntity.getEmailId().contains("@"))) || (!(regEntity.getEmailId().endsWith(".com")))) {
				valid = false;
				System.out.println("EmailId is invalid");
				return false;
			} else {
				valid = true;
				System.out.println("EmailId is valid");
			}

			if (regEntity.getPassword() == null || regEntity.getPassword().isEmpty() == true
					|| regEntity.getPassword().length() < 8 || regEntity.getPassword().length() > 36) {
				valid = false;
				System.out.println("Password is invalid");
				return false;
			} else {
				valid = true;
				System.out.println("Password is valid");
			}
			if (regEntity.getCity().length() < 3 || regEntity.getCity().length() > 56 || regEntity.getCity() == null
					|| regEntity.getCity().isEmpty() == true) {
				valid = false;
				System.out.println("City name is invalid");
				return false;
			} else {
				valid = true;
				System.out.println("City name is valid");
			}
			if (regEntity.getCountry().length() < 3 || regEntity.getCountry().length() > 56
					|| regEntity.getCountry() == null || regEntity.getCountry().isEmpty() == true) {
				valid = false;
				System.out.println("Country name is invalid");
				return false;
			} else {
				valid = true;
				System.out.println("Country name is valid");
			}

			String mobNo = String.valueOf(regEntity.getMobileNo());
			if (mobNo == null || !(mobNo.length() == 10)) {
				valid = false;
				System.out.println("Invalid mobile number");
				return false;
			} else {
				valid = true;
				System.out.println("mobile no is valid");
			}
			if (!(regEntity.isIndianCitizen() == true || regEntity.isIndianCitizen() == false)) {
				valid = false;
				System.out.println("Invalid indian citizen");
				return false;
			} else {
				valid = true;
				System.out.println("valid citizen");
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Its a Registration Page");
		}
		if (valid) {
			dao.save(regEntity);
		}
		return false;
	}

}

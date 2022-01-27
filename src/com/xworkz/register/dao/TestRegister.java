package com.xworkz.register.dao;


import com.xworkz.register.entity.RegisterEntity;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

public class TestRegister {

	public static void main(String[] args) {
		
		
		RegisterEntity rEntity = new RegisterEntity("radhikaM", "radhikam.xworkz@gmail.com", "rm591213", 
				"Belagavi",	"India", 9986408439L, true);
		 
		RegisterDao registerDao = new RegisterDaoImpl();
		RegisterService registerService = new RegisterServiceImpl(registerDao);
		registerService.validateAndSave(rEntity);
		
	}

}

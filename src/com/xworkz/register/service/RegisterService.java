package com.xworkz.register.service;

import com.xworkz.register.entity.RegisterEntity;

public interface RegisterService {
	public boolean validateAndSave(RegisterEntity regEntity);
}

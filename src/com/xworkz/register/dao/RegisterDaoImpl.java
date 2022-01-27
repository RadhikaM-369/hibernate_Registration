package com.xworkz.register.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.register.util.*;
import com.xworkz.register.entity.RegisterEntity;

public class RegisterDaoImpl implements RegisterDao{

	@Override
	public void save(RegisterEntity rEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
		try{
			entityManager.persist(rEntity);
			trans.commit();
		}
		catch (PersistenceException e) {
			e.printStackTrace();
			trans.rollback();
		}finally {
			if (entityManager != null) {
				entityManager.close();
			}
	}

}
		
	}
	


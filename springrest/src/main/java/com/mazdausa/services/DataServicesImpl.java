package com.mazdausa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mazdausa.dao.DataDao;
import com.mazdausa.model.Employee;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;

	public boolean addEntity(Employee employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	public Employee getEntityById(int id) throws Exception {
		return dataDao.getEntityById(id);
	}

	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	public boolean deleteEntity(int id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
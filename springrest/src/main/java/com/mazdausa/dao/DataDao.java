package com.mazdausa.dao;

import java.util.List;

import com.mazdausa.model.Employee;

public interface DataDao {

	public boolean addEntity(Employee employee) throws Exception;

	public Employee getEntityById(int id) throws Exception;

	public List<Employee> getEntityList() throws Exception;

	public boolean deleteEntity(int id) throws Exception;
}
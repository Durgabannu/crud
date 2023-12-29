package com.sample.crud.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.crud.Entity.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer>
{

}

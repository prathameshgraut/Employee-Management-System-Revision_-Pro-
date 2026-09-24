package Emp.com.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Emp.com.Repository.EmployeeRepo;
import Emp.com.Exception.ResourceNotFound;
import Emp.com.Service.EmployeeService;
import Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo empRepo;
	

	//Constructor use for save data inside Database
	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	
	//Save Record into DataBase
	@Override
	public Employee StoredEmployee(Employee e) {
		return empRepo.save(e);
	}

	
	//Retrive data in Based on Id
	@Override
	public Employee getEmployee(Integer id) {
		
		return empRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Employee","Id",id));
	}

	
	//Retrive All Record Using List 
	@Override
	public List<Employee> getEmpList() {
		return empRepo.findAll();
	}

	
	//Update Alreday Existing Record Based On Id
	@Override
	public Employee updateEmployee(Employee emp, Integer id) {
		Employee empUpdate= empRepo.findById(id).orElseThrow(()->new ResourceNotFound("Employee","id",id));
		
		empUpdate.setName(emp.getName());
		empUpdate.setAddress(emp.getAddress());
		empUpdate.setDesignation(emp.getDesignation());
		empUpdate.setEmail(emp.getEmail());
		empUpdate.setSalary(emp.getSalary());
		empUpdate.setMobileNo(emp.getMobileNo());
		empUpdate.setQulification(emp.getQulification());
		
		empRepo.save(empUpdate);
		
		return empUpdate;
	}

	
	//Delete Record Based On Id
	@Override
	public void deleteEmployee(Integer id) {
		empRepo.findById(id).orElseThrow(()-> new ResourceNotFound("Employee","id",id));
		empRepo.deleteById(id);
		
	}

}

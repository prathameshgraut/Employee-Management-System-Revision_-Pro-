package Emp.com.Service;

import java.util.List;

import Entity.Employee;

public interface EmployeeService {

	Employee StoredEmployee(Employee e);                   //Create
    Employee getEmployee(Integer id);                          //Read     ---Give Single Employee Based On Id
	List<Employee> getEmpList();                           //Get List Of Employee
	Employee updateEmployee(Employee emp,Integer id);    //Update
	void deleteEmployee(Integer id);                           //Delete 
}
 
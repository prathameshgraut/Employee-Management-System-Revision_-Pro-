package Service.ServiceImpl;

import java.util.List;

import Entity.Employee;

public interface EmployeeService {

	Employee StoredEmployee(Employee e);                   //Create
    Employee getEmployee(int id);                          //Read     ---Give Single Employee Based On Id
	List<Employee> getEmpList();                           //Get List Of Employee
	Employee updateEmployee(Employee empployee,int id);    //Update
	void deleteEmployee(int id);                           //Delete 
}
 
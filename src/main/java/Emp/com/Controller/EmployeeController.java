package Emp.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Emp.com.Service.EmployeeService;
import Entity.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
	}


	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(empService.StoredEmployee(e),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get")
	public List<Employee> getAllEmp(Employee e){
		return empService.getEmpList();
	}
	
	@GetMapping("/byid/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("id") Integer id){
		return new ResponseEntity<Employee>(empService.getEmployee(id),HttpStatus.OK);
	}
	
	@PutMapping("/upemp/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id,@RequestBody Employee e){
		return new ResponseEntity<Employee>(empService.updateEmployee(e, id),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> delEmployee(@PathVariable("id") Integer id ){
		empService.deleteEmployee(id);
		return new ResponseEntity<String>("Deleted Employee Record .....",HttpStatus.OK);
	}
	
	
}

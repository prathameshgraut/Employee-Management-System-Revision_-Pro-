package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id 
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private float salary;
	@Column
	private String designation;
	@Column
	private String Qulification;
	@Column(unique=true)
	private String email;
	@Column(unique=true)
	private int mobileNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQulification() {
		return Qulification;
	}
	public void setQulification(String qulification) {
		Qulification = qulification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", designation=" + designation + ", Qulification=" + Qulification + ", email=" + email + ", mobileNo="
				+ mobileNo + "]";
	}
}

package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "emid")
	private int empId;
	private String empName;
	private String empCity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Address> addresses;

	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", addresses=" + addresses
				+ ", laptop=" + laptop + "]";
	}

	public Employee(String empName, String empCity, List<Address> addresses, Laptop laptop) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.addresses = addresses;
		this.laptop = laptop;
	}
	
}

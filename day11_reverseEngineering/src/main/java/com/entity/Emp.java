package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emp database table.
 * 
 */
@Entity
@NamedQuery(name="Emp.findAll", query="SELECT e FROM Emp e")
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emid;

	private String empCity;

	private String empName;

	public Emp() {
	}

	public Emp(int emid, String empCity, String empName) {
		super();
		this.emid = emid;
		this.empCity = empCity;
		this.empName = empName;
	}

	public int getEmid() {
		return this.emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmpCity() {
		return this.empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
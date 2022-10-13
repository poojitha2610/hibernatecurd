package com.testModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee {
	
	
	
	private int  id;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private float sal;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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



	public float getSal() {
		return sal;
	}



	public void setSal(float sal) {
		this.sal = sal;
	}



	public Employee() {
		// TODO Auto-generated constructor stub
	}

}

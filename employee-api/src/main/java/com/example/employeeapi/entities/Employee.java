package com.example.employeeapi.entities;


import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	@Column(name = "FIRST_NAME")
	private String firstName;

//	@Column(name = "LAST_NAME")
	private String lastName;

	public Long getResourceId() {
		return id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}

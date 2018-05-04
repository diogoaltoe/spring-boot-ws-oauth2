package com.diogoaltoe.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "person_generator", sequenceName = "seq_person", allocationSize = 1, initialValue = 1)
@Table(name = "person", schema = "public")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator="person_generator")
	private int id;

	@Size(min = 0, max = 50)
	@Column(name = "first_name")
	private String firstName;
	
	@Size(min = 0, max = 50)
	@Column(name = "last_name")
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

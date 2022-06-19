package com.deyvison.springprojects.spingproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_user")

public class User {

	@Id//representando que id e a chave estrangeira da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id alto incrementavel pelo banco
	
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne//muitos para 1, representação dos usuarios pelo diagrama(1*n)
	@JoinColumn(name="department_id")//nome da chave estrangeira do banco
	Department department;
	
	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
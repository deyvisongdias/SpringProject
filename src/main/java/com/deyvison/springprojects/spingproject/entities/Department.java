package com.deyvison.springprojects.spingproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_deparment")//criando a tabela H2

public class Department {

	@Id//representando que id e a chave estrangeira da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id alto incrementavel pelo banco
	private Long id;
	private String name;
	
	public Department() {
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
	
	
}

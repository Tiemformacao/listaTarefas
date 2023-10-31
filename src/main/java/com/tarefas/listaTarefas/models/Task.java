package com.tarefas.listaTarefas.models;

import java.util.Date;


public class Task {

	
	private Long id;
	private String name;
	private Date date;
	
	//Criação de um construtor;
	public Task(Long id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	//Criação de um construtor vazio;
	public Task() {
		
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}

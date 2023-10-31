package com.tarefas.listaTarefas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarefas.listaTarefas.models.Task;

@Controller
public class TaskController {
	
	List<Task> tasks = new ArrayList<>();

	@GetMapping("/create")
	public String home() {
		return "create.html";
	}
	
	//O parâmetro é o objeto Task;
	@PostMapping("/create")
	public void create(Task task) {
		Long id = tasks.size() + 1L;
		tasks.add(new Task(id, task.getName(), task.getDate()));
	}
}

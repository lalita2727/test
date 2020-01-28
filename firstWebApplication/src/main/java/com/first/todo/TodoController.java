package com.first.todo;



import java.util.Date;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.first.login.LoginService;

@Controller
@SessionAttributes("username")
public class TodoController {
	@Autowired
	TodoService service;
	@RequestMapping(value="/list-todos",method =RequestMethod.GET, headers="Accept=application/xml")
	public String listTodos(ModelMap model) {
		model.addAttribute("todos",service.retrieveTodos("lalita"));
		
		return "list-todos";
	}
	@RequestMapping(value="/add-todo",method =RequestMethod.GET)
	public String showTodoPage() {
		
		return "todo";
	}
	@RequestMapping(value="/add-todo",method =RequestMethod.POST)
	public String addTodo(ModelMap model,  @RequestParam String desc) {
		//model.clear();
		service.addTodo("lalita", desc, new Date(), false);
		return "redirect:list-todos";
	}
	@RequestMapping(value="/delete-todo",method =RequestMethod.GET)
	public String deleteTodo(ModelMap model,  @RequestParam int id) {
		model.clear();
		service.deleteTodo(id);
		return "redirect:list-todos";
	
		
	}
	
}

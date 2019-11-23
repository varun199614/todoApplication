package com.Rest.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.Beans.TodoListItems;
import com.Rest.TodoDao.TodoDao;

@RestController
public class TodoEventsController {
	@Autowired
	private TodoDao DaoService;
	@GetMapping(path="/CompleteList") 
	public List<TodoListItems> completeSet(){
		return DaoService.findAll();
	}
	@GetMapping(path="/Eventdetail/{id}") 
	public TodoListItems findOne(@PathVariable int id){
		return DaoService.findOne(id);
	}
}

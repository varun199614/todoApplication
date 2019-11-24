package com.Rest.Todo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	@PostMapping("/AddingEven")
	public ResponseEntity<Object> AddingTodo(@RequestBody TodoListItems event) {
		
		TodoListItems events=DaoService.save(event);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(events.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}

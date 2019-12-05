package com.Rest.Todo;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Rest.Beans.TodoListItems;
import com.Rest.TodoDaoService.TodoDao;
import com.Rest.TodoDaoService.TodoJPAService;

@RestController
public class TodoEventsController {
	@Autowired
	private TodoDao DaoService;
	@Autowired	
	private TodoJPAService DaoJpaServices;
	@GetMapping(path="/CompleteList") 
	public List<TodoListItems> completeSet(){
		return DaoJpaServices.findAll();
	}
	@GetMapping(path="/Eventdetail/{id}") 
	public Optional<TodoListItems> findOne(@PathVariable int id){
		return DaoJpaServices.findById(id);
	}
	@DeleteMapping("DeleteEvent/{id}")
	public void delete(@PathVariable int id){
		DaoJpaServices.deleteById(id);
	} 
	@PostMapping("/AddingEven")
	public ResponseEntity<Object> AddingTodo(@RequestBody TodoListItems event) {
		
		TodoListItems events=DaoJpaServices.save(event);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(events.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}

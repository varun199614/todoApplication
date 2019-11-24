package com.Rest.TodoDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

import com.Rest.Beans.TodoListItems;

@Component
public class TodoDao {
	private static List<TodoListItems> events=new ArrayList<TodoListItems>();
	private int countOfEvents=3;
	static {
		events.add(new TodoListItems("varun birthday", new Date(), new Date(), "celebration at florida", 1));
		events.add(new TodoListItems("pavan birthday", new Date(), new Date(), "celebration at florida", 2));
		events.add(new TodoListItems("ayaan birthday", new Date(), new Date(), "celebration at florida", 3));
	}
	public List<TodoListItems> findAll(){
		return events;
	}
	public TodoListItems save(TodoListItems items) {
		items.setId(++countOfEvents);
		events.add(items);
		return items;
	}
	public TodoListItems findOne(int id) {
		for (TodoListItems x:events) {
			if(x.getId()==id) {
				return x;
			}
		}return null;
		
	}
}

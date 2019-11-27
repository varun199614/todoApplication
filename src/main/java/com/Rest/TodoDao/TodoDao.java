package com.Rest.TodoDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

import com.Rest.Beans.TodoListItems;
import com.Rest.TodoDao.CustomException.SearchingForInAppropriateDataExecption;

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
	public void delete(int id) {
		int flag=0;
		Iterator<TodoListItems> itemsItrater=events.iterator();
		while (itemsItrater.hasNext()) {
			TodoListItems x=itemsItrater.next();
			if(x.getId()==id) {
				flag=1;
				itemsItrater.remove();
			}
		}
		if(flag==0) {
			throw new SearchingForInAppropriateDataExecption("id which you are willing to delete is not prasent in database :"+id);
		}
		
		
	}
	public TodoListItems findOne(int id) {
		int flag=0;
		for (TodoListItems x:events) {
			if(x.getId()==id) {
				flag=1;
				return x;
			}
		}
		if(flag==0) {
			throw new SearchingForInAppropriateDataExecption("id which you are searching is not prasent in database :"+id);
		}
		return null;
		
	}
}

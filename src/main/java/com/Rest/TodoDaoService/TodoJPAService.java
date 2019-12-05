package com.Rest.TodoDaoService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.Beans.TodoListItems;

@Repository
public interface TodoJPAService extends JpaRepository<TodoListItems, Integer>{

}

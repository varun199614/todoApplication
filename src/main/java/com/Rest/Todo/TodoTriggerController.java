package com.Rest.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.Beans.StartTriggerJson;

@RestController
public class TodoTriggerController {

	@GetMapping(path="/StartTriggerJson")
	public  StartTriggerJson appTriggerJson() {
		return new StartTriggerJson("Hello World");
	}
}

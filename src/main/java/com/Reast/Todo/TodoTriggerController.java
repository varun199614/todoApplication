package com.Reast.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.Beans.StartTriggerJson;

@RestController
public class TodoTriggerController {
	@GetMapping(path="/StartTrigger")
	public String appTrigger() {
		return "Hello World";
	}
	@GetMapping(path="/StartTriggerJson")
	public  StartTriggerJson appTriggerJson() {
		return new StartTriggerJson("Hello World");
	}
}

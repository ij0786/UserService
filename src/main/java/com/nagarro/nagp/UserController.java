package com.nagarro.nagp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.json.simple.JSONObject;

@RestController
public class UserController {

    @SuppressWarnings("unchecked")
    @GetMapping("/user/1")
    public JSONObject getUser() {
    	
    	JSONObject obj = new JSONObject();
    	
    	 obj.put("name", "John");
         obj.put("age", "23");
         obj.put("email", "john.doe@google.com");
         
         return obj;
    	
    }

}

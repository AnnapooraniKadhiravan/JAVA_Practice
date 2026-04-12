package com.wipro.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
@RequestScope

public class EmployeeController {
	private int count = 0;
	
	@GetMapping
	public Map<String,Object> getEmployee(){
		count++;
		
		List<Employee> employees = Arrays.asList(
				new Employee(1,"Asha",50000),
				new Employee(2,"Chandru",60000),
				new Employee(3,"Kiran",70000)
				);
		
		Map<String, Object> response = new HashMap<>();
		response.put("count", count);
		response.put("employees", employees);
		
		return response;
				
	}
	

}

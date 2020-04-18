package Test.courseapi;

//import java.awt.List;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("employees")
	
	public List<Employee> getTopics()
	{
	return employeeservice.getemployees();
	
		
	}
	@RequestMapping("employee/{id}")

	public Employee getemployee(@PathVariable String id)
	{
		return employeeservice.getemployee(id);
	}
}

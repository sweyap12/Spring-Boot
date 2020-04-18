package Test.courseapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	 List<Employee>employees =Arrays.asList(
	
					new Employee("1","A","test"),
					
					
					new Employee("2","B","test 1"),
					new Employee("3","C","test 2"));
			
	public List<Employee> getemployees()
	{
		return employees;
	}
	public Employee getemployee(String id)
	{
		return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}


package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamFilterObjects {
    
    public static void main(String[] args) {

        List<User> persons = Arrays.asList(
                new User("Jack", "jack234@gmail.com"),
                new User("Jeter", "pete2@post.com"),
                new User("Jucy", "lucy17@gmail.com"),
                new User("Robert", "bob56@post.com"),
                new User("Martin", "mato4@imail.com")
        );
        
        List<User> result = persons.stream()
                .filter(person -> person.getName().equals("Jack"))
                .collect(Collectors.toList());
        
        result.forEach(p -> System.out.println(p.getName()));
        
        List<Employee> employees = Arrays.asList(new Employee(100,"JAgadees"),
        		new Employee(200,"Jaideep")
        		);
        	
        
    filterByName(employees);
    
    
    	
    }
    
public static void filterByName(List<Employee> employees) {
    	
	  Employee employee = employees.stream().filter(name->"Jaideep".equals(name.getEmpName())).findAny().orElse(null);
	  System.out.println("Employees Filter by Name :"+employee);
    	
    }
}
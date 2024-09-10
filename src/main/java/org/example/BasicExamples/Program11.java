package org.example.BasicExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Employee , name, salary ,department 
 * collections of employee 
 * using java 8 stream find the employee who has maximum salary.
 * 
 */
class EmployeeObject {
	 String name;
	 Integer salary;
	 String department;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeObject [name=" + name + ", salary=" + salary + ", department=" + department + ", getName()="
				+ getName() + ", getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeObject other = (EmployeeObject) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	/**
	 * @param name
	 * @param salary
	 * @param department
	 */
	public EmployeeObject(String name, Integer salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	 
}
/*
 * Employee , name, salary ,department 
 * collections of employee 
 * using java 8 stream find the employee who has maximum salary.
 * 
 */
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hey");
		EmployeeObject e1 = new EmployeeObject("e1",10000,"d1");
		EmployeeObject e2 = new EmployeeObject("e2",20000,"d2");
		EmployeeObject e3 = new EmployeeObject("e3",30000,"d3");
		EmployeeObject e4 = new EmployeeObject("e4",40000,"d1");
		EmployeeObject e5 = new EmployeeObject("e5",50000,"d1");
		
		List<EmployeeObject> empList = new ArrayList<EmployeeObject>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		EmployeeObject empObj   = empList.stream()
								  .sorted((o1,o2) -> o2.getSalary().compareTo(o1.getSalary()))
								  .findFirst()
								  .orElse(null);
			
	    if(empObj != null) {
	    	System.out.println(empObj.getSalary());
	    }
		
	    /// avg salary in each department 
	    // deptname, salary 
	    // d1 -> 1000
	    
	   // key -> department, avg-salry
	   // print map
	    
	    /*
	     *  Map<String, List<EmployeeObject>> map = empList.stream()
			                      .collect(Collectors.groupingBy(EmployeeObject::getDepartment))
	     */
	    
	   Map<String, Double> map = empList.stream()
			                      .collect(Collectors.groupingBy(EmployeeObject::getDepartment
			                       ,Collectors.averagingDouble(EmployeeObject::getSalary)
			                    		  ));
			                      
	   System.out.println(map);
	   
			                      /*
	   //Map<String, List<EmployeeObject>> h
	    
	    Map<String, List<EmployeeObject>> map = empList.stream()
                .collect(Collectors.groupingBy(EmployeeObject::getDepartment));
	    */
	    
	   //Map<String, List<EmployeeObject>> map         
	   
	   
               
               
	}

	

}

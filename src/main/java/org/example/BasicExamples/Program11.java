package org.example.BasicExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Employee e1 = new Employee(30,1000,"Yash");
		Employee e2 = new Employee(20,1000,"Pradeep");
		Employee e3 = new Employee(20,1000,"Test");
		// 
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		//sort by employye object by name 
		
		// 
	    // Collections.sort(empList,);
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
					 
				
			}
		});
		
		
		
		for(Employee e : empList ) {
			System.out.println("obj e : "+ e.getName());
		}
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.name.compareTo(o1.name);
					 
				
			}
		});
		
		for(Employee e : empList ) {
			System.out.println("obj e : "+ e.getName());
		}
		
	
		//Collections.sort(empList,Collections.reverseOrder());
		
		
		//Map<Integer , Integer> resMap = empList.stream().collect( Function.identity(),groupBy());
		
		
		
		//Integer count = empList.stream().filter(e -> e.getAge() == 20).count();
		
	   /*
	    * 
	    *  	
	    */
		
		
	}
	

}

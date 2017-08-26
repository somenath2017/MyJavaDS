package com.java.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Employee> employeeList = new LinkedList<>();
		Employee e1 = new Employee();
		e1.setEmployeeId("001");
		e1.setName("Adam");
		employeeList.insertFirst(e1);
		
		Employee e2 = new Employee();
		e2.setEmployeeId("002");
		e2.setName("Bodam");
		employeeList.insertFirst(e2);
		
		Employee e3 = new Employee();
		e3.setEmployeeId("003");
		e3.setName("Carl");
		employeeList.insertFirst(e3);
		
		System.out.println("List Before Deleting an Element");
		employeeList.displayList();
		
		employeeList.deleteFirst();
		
		System.out.println("List After Deleting an Element");
		employeeList.displayList();
		
		System.out.println("Find the 1st Employee in the list");
		Employee resultEmp = employeeList.find(e3);
		System.out.println("Employee is :"+ resultEmp);
		
		
		
	}
}

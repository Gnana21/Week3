package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("studentName");
	}

	public void studentDept() {
		System.out.println("studentDept");
	}

	public void studentId() {
		System.out.println("studentId");
	}
	
	public static void main(String[] args) {
		
		Department depobj = new Department();	
		depobj.collegeCode();
		depobj.collegeRank();
		depobj.collegName();
		depobj.depName();
		
		System.out.println("*************************");
		
		Student stuobj = new Student();
		stuobj.studentName();
		stuobj.studentId();
		stuobj.studentDept();
		stuobj.collegeCode();
		stuobj.collegeRank();
		stuobj.collegName();
		stuobj.depName();	
	}		
}
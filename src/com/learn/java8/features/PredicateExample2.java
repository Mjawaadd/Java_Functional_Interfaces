package com.learn.java8.features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
	static Predicate<Student> p1 = (p) -> p.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (p) -> p.getGpa() >= 3.6;
	
	public static void filterStudentGrade() {
	System.out.println("-----------filterStudentGrade----------------");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach( (student -> {
			
			if(p1.test(student)) {
				System.out.println(student);
			}
			
		} ) 	);
	}
	
	
	public static void filterStudentGPA() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach( student -> {
			
			if(p2.test(student)) {
				System.out.println(student);
			}
			
		}  	);
	}
	
	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			} 
		});
	}
	
	public static void main(String[] args) {
		
		filterStudentGrade();
		System.out.println("--------------filterStudentGPA--------------");
		filterStudentGPA();
		System.out.println("--------------filterStudens--------------");
		filterStudents();
	}

}

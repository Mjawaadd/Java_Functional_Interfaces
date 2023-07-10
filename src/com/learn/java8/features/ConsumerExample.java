package com.learn.java8.features;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	
	static Consumer<Student> c1 = (s)-> System.out.println(s);
	static Consumer<Student> c2 = (s)-> System.out.print(s.getName());
	static Consumer<Student> c3 = (s)-> System.out.println(s.getActivities());
		
	public static void printStudents() {
		List<Student> studentsList = StudentDataBase.getAllStudents();
		studentsList.forEach(c1);
	}
	
	
	public static void printStudentNamesAndActivities() {
		List<Student> studentsList = StudentDataBase.getAllStudents();
//		studentsList.forEach((s)-> {		
//		System.out.print(s.getName());
//		System.out.println(s.getActivities());		
//		});
		studentsList.forEach(c2.andThen(c3));	
		
	}
	
	public static void printStudentNamesAndActivitiesUsingCondition() {
		List<Student> studentsList = StudentDataBase.getAllStudents();
		studentsList.forEach((s) -> {
			
			if(s.getGradeLevel() >= 3 && s.getGpa() > 3.6) {
				c2.andThen(c3).accept(s);
			}
			
		});
		
		
	}
	
	public static void main(String[] args) {
		printStudents();
		System.out.println("--------printStudentNamesAndActivities-----------");
		printStudentNamesAndActivities();
		System.out.println("--------printStudentNamesAndActivitiesUsingCondition-----------");
		printStudentNamesAndActivitiesUsingCondition();
	}

}

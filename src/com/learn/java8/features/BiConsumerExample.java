package com.learn.java8.features;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	
	static BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + ":" + activities );
	
	public static void printNameAndACtivities(){
//		BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + ":" + activities );
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
		
	}
	
	public static void main(String[] args) {
		
		printNameAndACtivities();
		System.out.println("------------------------");
		printNameAndACtivitiesUsingCondition();
	}
	
	public static void printNameAndACtivitiesUsingCondition() {
//		BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + ":" + activities );
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((s)-> {
			
			if(s.getGradeLevel() >=3) {
				biConsumer.accept(s.getName(), s.getActivities());
			}
		} );
	}

}

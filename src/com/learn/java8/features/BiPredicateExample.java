package com.learn.java8.features;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {
	
	 BiPredicate<Integer, Double> biPredicate = (grade,gpa) -> grade>= 3 && gpa >=3.9;
	 BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " : " + activities);
	 Consumer<Student> studentConsumer = student -> {
		if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	public  void printStudentNameAndACtivities(List<Student> studentList) {
		
		
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		BiPredicateExample bp = new BiPredicateExample();
		List<Student> studentList = StudentDataBase.getAllStudents();
		bp.printStudentNameAndACtivities(studentList);
		
	
	}

}

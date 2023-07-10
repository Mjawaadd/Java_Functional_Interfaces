package com.learn.java8.features;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
	
	public static List<Student> getAllStudents() {
		
		Student student1 = new Student("Ant", 2, 3.6, "male", Arrays.asList("swimming","basketball","volleyball"));
		Student student2 = new Student("Bee", 2, 3.8, "female", Arrays.asList("swimming","gymnastics","soccerr"));
		Student student3 = new Student("cat", 3, 4.0, "male", Arrays.asList("swimming","gymnastics","aerobics"));
		Student student4 = new Student("dog", 3, 3.9, "female", Arrays.asList("swimming","gymnastics","soccerr"));
		Student student5 = new Student("elephant", 4, 3.5, "male", Arrays.asList("swimming","dancing","football"));
		Student student6 = new Student("fish", 4, 3.9, "female", Arrays.asList("swimming","basketball","baseball"));
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
		
		return students;
		
	}

}

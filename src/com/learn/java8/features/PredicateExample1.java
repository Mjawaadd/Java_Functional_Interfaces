package com.learn.java8.features;

import java.util.function.Predicate;

public class PredicateExample1 {
	static Predicate<Integer> p1 = (p) -> { return (p %2== 0);};
	static Predicate<Integer> p2 = (p) ->  (p % 2== 0);
	
	
	public static void predicateAnd() {
		
		System.out.println(" Predicate AND result : " + p1.and(p2).test(8));
		System.out.println(" Predicate AND result : " + p1.and(p2).test(9));
		
	}
	
	public static void predicateOR() {
		System.out.println("Predicate OR result : " + p1.or(p2).test(8));
		System.out.println("Predicate OR result : " + p1.or(p2).test(40));
	}
	
	public static void predicateNegate() {
		System.out.println(" Predicate Negate result : " + p1.and(p2).negate().test(8));
		System.out.println(" Predicate Negate result : " + p1.or(p2).negate().test(9));
	}
	
	public static void main(String[] args) {
		System.out.println(p1.test(6));
    	System.out.println(p2.test(8));
    	System.out.println("--------predicateAnd()---------");
    	predicateAnd();
    	System.out.println("--------predicateOR()---------");
    	predicateOR();
    	System.out.println("--------predicateNegate()---------");
    	
    	predicateNegate();
		
    	

		
	}

}

package com.learning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequencialProcesses {

	public static void main(String[] args) {

		List<Integer> preOpe = IntStream.range(0, 1000000).boxed().collect(Collectors.toList());
		long startTime = System.nanoTime();
		System.out.println(" StartTime :  " + startTime);
		List<Integer> postOpe = preOpe.stream().map(e->e+e).sorted().filter(e->e%2==0).collect(Collectors.toList());
		long endTime = System.nanoTime();
		System.out.println(" EndTime : " + endTime);
		
		System.out.println("Size of postOpe (sequential): " + postOpe.size()); 
		System.out.println("First 10 elements (sequential): " + postOpe.subList(0, 10));
	}
		
	}


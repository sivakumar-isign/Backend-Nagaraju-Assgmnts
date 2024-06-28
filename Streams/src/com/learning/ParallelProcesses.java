package com.learning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelProcesses {

	public static void main(String[] args) {

	List<Integer> preOpe = IntStream.range(0, 1000000).boxed().collect(Collectors.toList());
	long startTime = System.nanoTime();
	System.out.println(" StartTime :  " + startTime);
		List<Integer> postOpe = preOpe.parallelStream().map(e->e+e).sorted().filter(e->e%2==0).collect(Collectors.toList());
		long endTime = System.nanoTime();
		System.out.println(" endTime :  " + endTime);
		System.out.println("Size of postOpe (Parallel): " + postOpe.size()); 
		System.out.println("First 10 elements (Parallel): " + postOpe.subList(0, 10));
	}

}

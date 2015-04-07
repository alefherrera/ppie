package main;

import java.util.ArrayList;
import java.util.List;

import conditions.BiggerThan;
import conditions.Condition;
import specifications.ISpecification;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> universo = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			universo.add(i);
		}
		
		
		
		Condition<Integer> s = new BiggerThan(3);
		System.out.println(s.IsSatisfiedBy(2));
	}

}

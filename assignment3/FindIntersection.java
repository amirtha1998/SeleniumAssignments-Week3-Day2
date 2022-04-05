package week3.day2.assignment3;

import java.util.ArrayList;

public class FindIntersection {
	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (shoud match item in both arrays)
	 */
	public static void main(String[] args) {
		String intersection="";
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
		list.add("2");
		list.add("11");
		list.add("4");
		list.add("6");
		list.add("7");
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("8");
		l.add("4");
		l.add("9");
		l.add("7");
for(int i=0;i<list.size();i++) {
	if(list.get(i)==l.get(i)) {
		intersection+=list.get(i)+" ";
	}
}
System.out.println(intersection.trim());
		}
	

}

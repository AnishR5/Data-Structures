package Searching;

import java.util.Scanner;

public class TestSearching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {11,22,33,44,55,66,77,88,99};
		System.out.println("Enter a number");
		int a=sc.nextInt();
		Searching search=new Searching();
		System.out.println(search.LinearSearch(a, arr)); 
		
		System.out.println(search.BinarySearch(a, arr));
		System.out.println(search.recBinarySearch(arr, a, 0, arr.length-1));

	}

}

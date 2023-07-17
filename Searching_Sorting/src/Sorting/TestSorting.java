package Sorting;

import java.util.Arrays;

public class TestSorting {

	public static void main(String[] args) {
		Sorting sort=new Sorting();
		int [] arr= {6,4,2,8,3,1};
		sort.display(arr);
		
		//sort.selectionSortAscd(arr);
		//sort.display(arr);
		//sort.selectionSortDesc(arr);
		//sort.bubbleSortAscending(arr);
		sort.bubbleSortDesc(arr);
		sort.display(arr);
		
		}

}

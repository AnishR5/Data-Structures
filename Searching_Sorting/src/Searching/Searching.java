package Searching;
public class Searching {

	public int LinearSearch(int data,int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data) 
				return i; 
		}
		
		return -1; 
	}
	
	public int BinarySearch(int data,int [] arr)
	{
		int left=0;
		int right=arr.length-1;
		
		while(left<=right )
		{
			int mid=(left+right)/2;
			if(data==arr[mid])
				return mid;
			if(data>arr[mid])    // data bigger than mid then change the left,right
			{
				left=mid+1;
					
			}
			else {
				
				right=mid-1;
			}
		}
		return -1;
	}
	
	public int recBinarySearch(int [] arr,int key,int left,int right)
	{
		if(left>right)
			return -1;
		int mid=(left+right)/2;
		int index;
		if(key==arr[mid])
			return mid;
		if(key>arr[mid])
		{
			index=recBinarySearch(arr, key, mid+1, right);
		}
		else
			index=recBinarySearch(arr, key, left, right+1);
		
		return index;
		
	}

}

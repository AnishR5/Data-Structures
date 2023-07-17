package Sorting;

public class Sorting {

	public void selectionSortAscd(int[] arr)
	{
		//select one element and compare it with all other elemnts in array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	
	public void selectionSortDesc(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	
	public void bubbleSortAscending(int[] arr)
	{
		int cnt=0;
		while(cnt<arr.length)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}	
			cnt++;
		}
		
	}
	
	public void bubbleSortAscendingImproved(int[] arr)
	{
		int cnt=0;
		while(cnt<arr.length)
		{
			for(int i=0;i<arr.length-1-cnt;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}	
			cnt++;
		}
		
	}
	
	public void bubbleSortAscendingMoreImproved(int[] arr)  //best case
	{
		int cnt=0;
		boolean swapflag=false;
		while(cnt<arr.length)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
					swapflag=true;
				}
			}
			if(swapflag==false)
				break;
			cnt++;
		}
		
	}
	
	public void bubbleSortDesc(int[] arr)
	{
		int cnt=0;
		while(cnt<arr.length)
		{
			for(int i=0;i<arr.length-1-cnt;i++)
			{
				if(arr[i]<arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}	
			cnt++;
		}
	}
	
	public void insertion(int[] arr)
	{
		int j,temp=arr[arr.length-1];
		
		for(j=arr.length-2;j>=0 && arr[j]>temp;j--)
		{
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}
	
	public void display(int [] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}

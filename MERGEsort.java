

Skip to content
Using Gmail with screen readers
Conversations
0.42 GB of 15 GB used
Terms · Privacy · Program Policies
Last account activity: 19 minutes ago
Details
package JAVAPROGRAM;

import java.util.Random;
import java.util.Scanner;

public class Quicksort {
	public static void sort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int i=low,j=high;
		int temp;
		int pivot=arr[low];
		while(i<=j)
		{
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			}
		if(low<j)
			quickSort(arr,low,j);
		if(i<high)
			quickSort(arr,i,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int size=scanner.nextInt();
		int[]array=new int[size];
		Random random=new Random();
		System.out.println("populating array with random numbers");
		for(int i=0;i<size;i++)
		{
			array[i]=random.nextInt();
		}
		System.out.println("original array \n");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]+"");
		}
		long startTime=System.currentTimeMillis();
		sort(array);
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("\n sorted array \n");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]+"");
		}
	
		System.out.println("\n total time taken to sort the numbers is :"+executionTime+"milliseconds");
	    scanner.close();
	}
	}


Quicksort.java
Displaying Quicksort.java.
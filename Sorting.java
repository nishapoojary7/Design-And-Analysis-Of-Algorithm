package daalab;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num,i,j,temp;
		Scanner userInput=new Scanner(System.in);
				System.out.println("enter the number");
				num=userInput.nextInt();
				int array[]=new int[num];
				System.out.println("enter "+"num "+"integer :");
				for(i=0;i<num;i++)
				{
				 array[i]=userInput.nextInt();
				}
				for(i=0;i<(num-1);i++)
				{
					for(j=0;j<num-1-i;j++)
					{
						if(array[j]>array[j+1])
						{
							temp=array[j];
							array[j]=array[j+1];
							array[j+1]=temp;
						}
					}
				}
				System.out.println("sorted elements");
				for(i=0;i<num;i++)
					System.out.println(array[i]);
	}
}

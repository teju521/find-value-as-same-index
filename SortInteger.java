/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
class SortInteger
{
    public static void unique(int[] p, int sz)
		{
			for(int i=0;i<sz;i++)
			{
				if(p[i]==i)
					System.out.println("Value  equals to"+p[i] +"its index is"+ i);
			}
		}
	public static void main(String[] args)
	{
		int[] a = new int[50];
		int i,temp,j;
		System.out.println("Enter the size of array");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		for(i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		
		}
		for(i=0;i<size;i++)
		{
		    for(j=i+1;j<size;j++)
		    {
		        if(a[i]>a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		for(i=0;i<size;i++)
			System.out.println("Sorted elements are\t:"+ a[i]);
		unique(a,size);
	}
}

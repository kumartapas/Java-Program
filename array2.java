//multiple of 3 which are also 8
//store 10 number into an arrau display the elements of the array after storing display the count of odd no.
import java.util.*;
class array2
{
public static void main(String arg[])
{
	int arr[],n,c=0;
	System.out.println("enter the size of an array");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	arr=new int[20];
	System.out.println("enter the element to arry");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	//System.out.println("arr elements are:"+arr[i]);
	for(int i=0;i<n;i++)
	{
		System.out.println("element of array:"+arr[i]);
		if(arr[i]%2!=0)
		{
			c=c+1;
		}
	}
	System.out.println("odd:"+c);
	
}
}
import java.util.*;
class arrex
{
public static void main(String arg[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array:");
a=sc.nextInt();
int arr[]=new int[200];
for(int c=0;c<a;c++)
{
arr[c]=sc.nextInt();
}
for(int c=0;c<a;c++)
{
System.out.println("element of array:"+arr[c]);
}
System.out.println("enter the value to be insert");
int v=sc.nextInt();
System.out.println("enter the position where to be insert");
int pos=sc.nextInt();
for(int c=a;c>pos;c--)
{
	arr[c]=arr[c-1];
}
arr[pos]=v;
for(int c=0;c<a;c++)
{
	System.out.println(arr[c]+" ");
}
}

}
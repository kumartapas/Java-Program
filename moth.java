//store 10 number into an arrau display the elements of the array after storing display the count of odd no.

import java.util.*;
class moth
{
public static void main(String arg[])
{
int a,arr[];
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
arr=new int[10];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
System.out.println("the element of arr"+arr[i]);
}
}
}
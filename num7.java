import java.util.*;
class num7
{
public static void main(String arg[])
{
int a=1,b=4,c=7,d,i,e;
System.out.print("enter the values:");
Scanner sc=new Scanner(System.in);
d=sc.nextInt();
System.out.print("display the  value="+a+" "+b+" "+c);
for(i=1;i<=d;i++)
{
	e=a+b+c;
	System.out.print(" "+e);
	a=b;
	b=c;
	c=e;
	
}
}
}
import java.util.*;
class prime
{
public static void main(String arg[])
{
int i,j,k=0,l=1;
System.out.println("enter a number="); //value enter
Scanner odd=new Scanner(System.in);
j=odd.nextInt();
System.out.println("The enter value is="+j); //value display
for(l=1;l<=50;l++)
{
for(i=1;i<=j;i++)
{
	if(j%i==0)
	{
		k++;
	}
}
if(k==2)
{
System.out.println("the number is a prime number"+j);
}
else
{
System.out.println("the number is not a prime number");
}
}

}
}


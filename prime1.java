import java.util.*;
class prime
{
public static void main(String arg[])
{
int a,b,count,c;
//Scanner ta=new Scanner(System.in);
//a=ta.nextInt();
for(b=1;b<=20;b++)
{
	j=1;
	count=0;
	for(c=1;c<=b;c++)
	{
      if(c%b==0)
	
       {
        count++;
         j++;
       }
	}
}
if(count==2)
{
System.out.println("it is prime number");
}
System.out.println("not a prime number");
}
}
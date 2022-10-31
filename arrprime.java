import java.util.*;
class arrprime
{
public static void main(String arg[])
{
int a=0;
//Scanner sc=new Scanner(System.in);
//i=sc.nextInt();
for(a=100;a>=1;a--)
{
	
int b=0,i;
for(i=1;i<=a;i++)
{
if(a%i==0)
{
b=b+1;
}
}
if(b==2)
{
System.out.println(a);
}
}

}
}
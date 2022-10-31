import java.util.*;
class num2
{
public static void main(String arg[])
{
int a,b,c,d;
System.out.println("\nenter value=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(b=1;b<=a;b++)
{
c=(int)(Math.pow(b,b));
System.out.println(c);
}
}
}
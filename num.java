import java.util.*;
class num
{
public static void main(String arg[])
{
int a,b,c=1,d;
System.out.println("\nenter value=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(b=1;b<=a;b++)
{
if(b%2==0)
{
d=b*b;
System.out.println(d);
}
}
}
}
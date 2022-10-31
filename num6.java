import java.util.*;
class num6
{
public static void main(String arg[])
{
int a,b,c;
System.out.println("\nenter value=");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(b=1;b<a;b++)
{
c=b*b;
if(c%8!=0)
{
System.out.println(+c);
}
}
}
}
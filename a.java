import java.util.*;
class a
{
public static void main(String arg[])
{
int a=0,b=1,c,d;
Scanner in = new Scanner(System.in);
c=in.nextInt();
System.out.println(b);
for(int i=0;i<=c;i++)
{
d=a+b;
a=b;
b=d;
System.out.println(d);
}
}
}
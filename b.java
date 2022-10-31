import java.util.*;
class b
{
public static void main(String arg[])
{
int a=1,b,c;
Scanner in = new Scanner(System.in);
c=in.nextInt();
System.out.println(a);
for(int i=1;i<=c;i++)
{
b=a+i*i;
a=b;
System.out.println(b);
}
}
}
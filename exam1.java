class exam1
{
public static void main(String arg[])
{
int a=1,b=1;
while(b<=20)
{
if(a%7==0)
{
if(a%2==1 && a%3==1 && a%4==1 && a%5==1 && a%6==1)
{
System.out.println("\n"+a);
b=b+1;
}
}
a++;
}
}
}
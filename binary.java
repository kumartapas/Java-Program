class binary
{
public static void main(String arg[])
{
int a[]={1,2,3,4,8,6,7,8,9,10};
int n=8;	int pos=-1; int s=0,e=a.length-1,mid;
while(s<=e)
{
mid=s+e/2;
if(n==a[mid])
{
pos=mid;
break;
}
else if(n<a[mid])
{
e=mid-1;
}a
else
{
s=mid+1;
}
}
if(pos==-1)
{
System.out.println("the number is not found");
}
else
{
System.out.println("the number is found"+(pos+1));
}
}	
}
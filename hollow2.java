class hollow2
{
public static void main(String arg[])
{
int row,col;
for(row=1;row<=7;row++)
{
	for(col=1;col<=7;col++)
	{
	if(col==1 || col==row )
	{
	System.out.print("*");
	}
	else if(row==7)
	{
		
	System.out.print("*");
		
	}
	else
	{
	System.out.print(" ");
	}

	}
System.out.println("");
}
}
}
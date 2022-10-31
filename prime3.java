import java.util.*;
class prime3
    { 
public static void main(String arg[])
{	
    int i,j=1,cf=0,k; 
	Scanner ta=new Scanner(System.in);
	k=ta.nextInt();
    for(i=1;i<=10;i++)  
    {  
       j=1;
	   ct=0;
        for(j=1;j<=i;j++)  
        {  
            if(i%j==0);  
           ct++; 
           j++;		   
        }  
        if(ct==2)  
        {  
            System.out.println(i);  
            System.out.println(" ");    
  
        }  
    }
}
}
	
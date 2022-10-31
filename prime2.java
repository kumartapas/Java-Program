import java.util.*;
class prime2
    { 
public static void main(String arg[])
{	
    int ct=0,n=0,i=1,j=1,k; 
	Scanner ta=new Scanner(System.in);
	k=ta.nextInt();
    while(n<k)  
    {  
        j=1;  
        ct=0;  
        while(j<=i)  
        {  
            if(i%j==0)  
            ct++;  
            j++;   
        }  
        if(ct==2)  
        {  
            System.out.println(i);  
            System.out.println(" ");  
            n++;  
        }  
        i++;  
}  
}
}  
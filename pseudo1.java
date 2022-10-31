import java.util.*;

public class pseudo1 {

    public static void main(String args[]) {
        int k,a,e = 2, f = 1; //assign the values to variable
        System.out.println("enter the number="); //take the values as input
        Scanner bb = new Scanner(System.in);//creat the object to store the enter values
        a = bb.nextInt();                   //values is store with the help of object
        System.out.println(f);
		 System.out.println(e);
        for (k = 1; k < a; k++) //apply the condtion
		{
		
            f= f + 3;
           e=e+4;
            System.out.println(+f);
			  System.out.println(+e);

    }

}
}

import java.util.*;

public class pseudo {

    public static void main(String args[]) {
        int k,a,c = 0, d = 0, e = 1, f = 1; //assign the values to variable
        System.out.println("enter the number="); //take the values as input
        Scanner bb = new Scanner(System.in);//creat the object to store the enter values
        a = bb.nextInt();                   //values is store with the help of object
        System.out.println(f);
        for (k = 1; k < a; k++) //apply the condtion
		{
            c = d + e;
            d = e;
           e = c;
            System.out.println(c);

        }

    }

}

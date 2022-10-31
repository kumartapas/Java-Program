import java.util.Scanner;

public class Date{
public static void main(String[] args){
    String months[]={"Jan","feb","Mar","Apr","May","june","jul","Aug","Sep","Oct","Nov","Dec"};
    int Days_inMonths[]={31,28,31,30,31,30,31,31,30,31,30,31};
    Scanner sc = new Scanner(System.in);
    System.out.print("Please input Year:");
    int Year =sc.nextInt();
    System.out.print("Please input Month:");
    int month =sc.nextInt();
    System.out.print("Please input Day:");
    int day =sc.nextInt();

    if(Year%4==0 || Year%100==0 && Year%400==0)
        Days_inMonths[1]=29;
    int diff =0,i=0;
    for(i=0;i<month-1;i++)
    {
        diff=diff+Days_inMonths[i];
        System.out.print(months[i]+": "+Days_inMonths[i]+"  ");
    }
    diff=diff+day;
    System.out.print(months[month-1]+": "+day);

    System.out.println("\nTotal Days: "+diff);
   

   
   
}
}
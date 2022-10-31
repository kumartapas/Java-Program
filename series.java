 import java.util.Scanner;
	class q
	{
		public static void main( String args[]){
			int n;
			int a;
			int count=0;
			Scanner sk=new Scanner(System.in);
			System.out.println(" Enter where you can stop the series:");
			n=sk.nextInt();
			for(int i=1;i<n;i++){
				a=i*3;
				System.out.println(a);
				while(a!=0){
					if(a%10==3){
						count++;
						break;
					}
					a=a/10;
					
				}
			}
			System.out.println(count);
		}
	}
		

class Adlab02{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i+j==4)||(i-j==2)||(i+j==8)||(j-i==2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
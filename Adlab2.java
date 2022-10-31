import java.util.Scanner;

 class Adlab2{
	public static void main(String[] args) {
	
		int[] arr = {32,5,41,6,9,4,25,14,17,20};
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which number you want to search ?");
		int item = sc.nextInt();
		int temp = 0;
		for(int i=0; i<arr.length; i++)
		{
				if(arr[i] == item)
				{
					System.out.println("The number "+item+" is present in array at index "+i);
					temp = temp + 1;
				}
		}		
		if(temp == 0)
		{
			System.out.println("The number is not present in array");
		}
	}
}
class Adlab1{
	public static void main(String[] args) {
		//int[][] arr = new int[4][3];

		int[][] arr= { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
		int rows = 4;
		int columns = 3;
		
		int trRows = columns;
		int trColumns = rows;
		int[][] transpose = new int[trRows][trColumns];
		System.out.println("Before transpose our matrix is:");
		
		//display the matrix
		for(int i=0; i<rows; i++)        //  row in our matrix
		{
			for(int j=0; j<columns; j++)  // column in each row
			{
				System.out.print(arr[i][j] + "   ");
				transpose[j][i] = arr[i][j];		//Transpose the matrix: change its value from 01 to 10, 02 to 20
			}
			System.out.println();
		}
		System.out.println("------------------");
		System.out.println("after transpose our matrix is:");
		
		//after transpose 
		for(int i=0; i<trRows; i++){
			for(int j=0; j<trColumns; j++){
				System.out.print(transpose[i][j]+"    ");
			}
			System.out.println();
		}
		
	}
}
class MultiArrayExample
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{8, 7, 3},{3,5,6},
			{4, 9, 6},{3,5,6},{3,5,6}
		};

		for(int i = 0; i < arr.length; i++)          
		{
			for(int j = 0; j < arr[i].length; j++)  
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();  
		}
	}
}
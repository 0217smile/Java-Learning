class ArrayDemo3
{
	public static void main(String[] args) {
		//int[] arr = new int[3];
		int[] arr = {3,4,5,67,8};
		System.out.println(arr);
		printArray(arr);	
		printArray(arr);			
	}

	public static void printArray(int[] arr){
		for (int x=0; x<arr.length; x++) {
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);			
		}
	}
}
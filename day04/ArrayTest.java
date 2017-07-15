class ArrayTest
{
	public static void main(String[] args) {
		int[] arr = {4,54,55,588,6,2,8,3};

		int max = getMax_2(arr);
		int min = getMin(arr);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	public static int getMax(int[] arr){
		int max = arr[0];
		 for (int x=1; x<arr.length; x++) {
		 	if(arr[x]>max)
		 		max = arr[x];
		 }
		 return max;
	}
	public static int getMax_2(int[] arr){
		int max_index = 0;
		for (int x=1; x<arr.length; x++) {
			if(arr[x]>arr[max_index])
				max_index = x;
		}
		return arr[max_index];
	}
	public static int getMin(int[] arr){
		int min_index = 0;
		for (int x=1; x<arr.length; x++) {
			if(arr[x]<arr[min_index])
				min_index = x;
		}
		return arr[min_index];
	}
}
/*数组排序*/
class ArrayTest2{
	/*选择排序*/
	public static void selectSort(int[] arr){
		for (int x=0; x<arr.length-1; x++) {
			for (int y=x+1; y<arr.length; y++) {
				if (arr[x]>arr[y]) {
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
					swap(arr, x, y);
				}
			}
		}
	}
	/*冒泡排序:相邻两个位置比较*/
	public static void bubbleSort(int[] arr){
		for (int x=0; x<arr.length-1; x++) {//for(int x=arr.length-1; x>0; x--)
			for (int y=0; y<arr.length-x-1; y++) {//for(int y=0; y<x; y++)
				if (arr[y]<arr[y+1]) {//">"的排序结果为升序。"<"的排序结果为降序
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr, y, y+1);
				}
			}
		}
	}

	public static void printArray(int[] arr){
		for (int x=0; x<arr.length; x++) {
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);			
		}
	}

	public static void swap(int arr[], int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {2,88,56,4,5,22,335,774};
		System.out.println("数组排序前:");
		printArray(arr);
		selectSort(arr);
		System.out.println("数组选择排序后:");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("数组冒泡排序后:");
		printArray(arr);
		//Array.sort(arr);java中自带的排序方式。
	}
}
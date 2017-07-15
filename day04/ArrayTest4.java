/*
数组的查找操作
*/
class ArrayTest4{
	public static void main(String[] args) {
		int[] arr = {3,2,5,86,74,24};
		int index = getIndex(arr, 86);
		System.out.println("index="+index);
	}
	//获取key 第一次出现在数组中的位置，若返回-1 说明key在数组中不存在。
	public static int getIndex(int[] arr, int key){
		for (int x=0; x<arr.length; x++) {
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}
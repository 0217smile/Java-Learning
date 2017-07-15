class FunctionDemo2
{
	public static void main(String[] args) {
		int result = getSum(4,5);
		System.out.println(result);	
	}

	public static int getSum(int x, int y){
		return x+y;
	}
	public static boolean compare(int a, int b){
		//return (a==b)?true:false;
		return a==b;
	}
	/*
	需求：对两个数比较，获取较大的数。
	*/
	public static int getMax(int a, int b){
		return (a>b)?a:b;
	}
}
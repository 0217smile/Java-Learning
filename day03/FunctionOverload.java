class FunctionOverload{
	public static void main(String[] args) {
		add(4,5);
		System.out.println(add(4,5,6));
		print99();
	}

	//打印乘法表
	public static void print99(int num){
		for (int x=1; x<=num; x++) {
			for (int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	//打印99乘法表
	public static void print99(){
		print99(9);
	}

	public static int add(int x, int y){
		return x+y;
	}

	public static int add(int x, int y, int z){
		return add(x, y)+z;
	}
}
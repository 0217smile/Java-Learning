class FunctionTest{
	public static void main(String[] args) {
		draw(4,5);
		printHr();
		draw(6,8);
		printHr();
		print99();
	}

	/*
	定义一个打印99乘法表功能的函数。
	*/

	public static void print99(){
		for (int x=1; x<=9; x++) {
			for (int y=1; y<=x; y++) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	public static void draw(int row, int col){
		for (int x=0; x<row; x++) {
			for (int y=0; y<col; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printHr(){
		System.out.println("---------------------------");
	}
}
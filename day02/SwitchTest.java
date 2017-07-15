class SwitchTest
{
	public static void main(String[] args) 
	{
	    //中文乱码问题，这样编译：javac -encoding utf-8 SwitchTest.java即可。
		int x = 4;
		switch(x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(x+"夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"冬季");
				break;
			default:
				System.out.println("nono");
		}	
	}
}
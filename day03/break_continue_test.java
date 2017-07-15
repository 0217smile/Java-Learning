class OtherDemo
{
	public static void main(String[] args) 
	{
		//break 1.switch中 2.for while 循环中
		w:for(int x=0; x<3; x++)//标号可以用在循环上
		{
			q:for(int y=0; y<4; y++) 
			{
				System.out.println("x="+x);
				break w;//break调当前循环，即本身所在循环	
			}
		}
		System.out.println("------------------------------------");
		//continue:只能用于循环结构，终止本次循环，继续下一次循环
		for(int x=1; x<10; x++){
			if(x%2==1)
				continue;
			System.out.println("x="+x);
		}
		System.out.println("------------------------------------");
		w:for (int x=0; x<3; x++){
			for(int y=0; y<4; y++){
				System.out.println("x="+x);
				continue w;
			}		
		}
		/*
		
		*/	
	}
}
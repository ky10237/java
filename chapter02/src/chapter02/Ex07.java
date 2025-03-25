package chapter02;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b=1;
		
		for(a=0;a<4;a++)
		{
			if(a+b==2)
				continue;
				System.out.println(a+"+"+b+"="+(a+b));
		}
		
		for(a=0;a<4;a++)
		{
			if(a+b==2)
				break;
				System.out.println(a+"+"+b+"="+(a+b));
		}
	}

}

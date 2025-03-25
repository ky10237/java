package chapter02;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,i=0;
		
		do 
		{
			i++;
			s=s+i;
			System.out.print("+"+s);
		}
		while(i<10);
		System.out.println("까지의 합은"+s);
	}

}

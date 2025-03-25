package chapter02;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, n=14, w=5;
		
		do {
			System.out.println("n값: "+n);
		
		}while(n<0);
		
		do {
			System.out.println("w값: "+w);
		}while(w<=0||w>n);
		
		for(i=0;i<n;++i) {
			
			if(i%w==0)
				System.out.println();
			System.out.print("*");
		}
		
	}
}

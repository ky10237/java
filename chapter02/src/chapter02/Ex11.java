package chapter02;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		for(int a=1;a<=4;a++) {
			for(int b=3;b>=a;b--) {
				System.out.print("*");
			}
			for(int c=0;c<=a;c++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for(int z=1;z<=4;z++) {
			for(int x=1;x<=z;x++) {
				System.out.print("*");
			}
			for(int c=1;c>=z;c--) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}

package chapter03;

class Calc{
	int add(int a, int b) {
		return a+b;
	}
	int sdd(int c, int d) {
		return c-d;
	}
	int aad(int e,int f) {
		return e*f;
	}
	int ddd(int g, int h) {
		return g/h;
	}
}

public class Calculation {
	static void disp() {
		int c,s,a,d;
		Calc calc=new Calc();
		
		c=calc.add(8,9);
		s=calc.sdd(8,9);
		a=calc.aad(8,9);
		d=calc.ddd(8,9);
		
		System.out.println("8+9="+c);
		System.out.println("8-9="+s);
		System.out.println("8*9="+a);
		System.out.println("8/9="+d);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp();
	}

}

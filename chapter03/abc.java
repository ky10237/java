package chapter03;
class A{
	boolean a;
	int b;
	double c;
	String d;
	
	void abc(){
		System.out.println(b+c);
		System.out.println(c+d);
		System.out.println(d+a);
	}
}

class ABC{
	public static void main(String[] atgs) {
		A a=new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println();

		a.abc();
	}
}
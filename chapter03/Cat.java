package chapter03;

class pat{
	String name;
	String place;
	int age;
	
	void setData(String n,String p, int a) {
		name=n;
		place=p;
		age=a;
	}
	
	void print() {
		System.out.println(place+":"+name+" "+age+"살");
	}
	void print(String p, int a) {
		place=p;
		System.out.println(place+":고양이는 "+a+"마리입니다.");
	}
	void print(String variety) {
		System.out.println(place+":"+name+" "+age+"살"+variety);
	}
}

public class Cat {

	public static void main(String[] args) {
		
		pat  cat1= new pat();
		pat  cat2= new pat();
		pat  cat3= new pat();
		cat1.setData("로빈", "우리집", 10);
		cat2.setData("아이", "옆집", 14);
		cat1.print("잡종");
		cat2.print();
		cat3.print("뒷집",0);
	}
}

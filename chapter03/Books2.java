package chapter03;
class Book1{
	String title;
	String writer;
	
	Book1(String t, String w){
		title =t;
		writer=w;
	}
	
	Book1(Book1 copy){
		title =copy.title;
		writer=copy.writer;
	}
	void print() {
		System.out.println("제 목: "+title);
		System.out.println("저 자: "+writer);
	}
}

public class Books2 {

	public static void main(String[] args) {

		Book1 book1 = new Book1("c가 보이는 그림책","ANK");
		book1.print();
		Book1 book2 = new Book1(book1);
		book2.title="자바가 보이는 그림책";
		book2.print();
	}

}

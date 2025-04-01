package chapter03;
import java.util.Scanner;
class Book{
	int price;
	int num=0;
	String title;
	
	Book(String t, int p){
		title =t;
		price =p;
	}
	
	void print() {
		System.out.println("제목: "+title);
		System.out.println("가격: "+price);
		System.out.println("주문 수량: "+num);
		System.out.println("합계 금액: "+price*num);
	}
}
public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=0;

		Book book=new Book("c가 보이는 그림책",12000);
//		book.num=9;
//		book.print();
//		
//		System.out.println(" ");
//		book.title="java가 보이는 그림책";
//		book.price=15000;
//		book.num=5;
//		book.print();
		for(;;) {
			for(int i=0;i<3;i++) {
			System.out.println(" ");
			book.title=sc.next();
			book.price=sc.nextInt();
			book.num=sc.nextInt();
			book.print();
			total+=book.price*book.num;
			}
			System.out.println("책을 3권 더 입력하시겠습니까? 그렇다면 1 아니면 0");
	
			int j=sc.nextInt();
			if(j==1) {
				continue;
			}else if(j==0){break;}
			
		}

		System.out.println("책의 총 가격은 "+total+"원 입니다.");
				
	}

}

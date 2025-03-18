package chapter01;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr=new Scanner(System.in);
		
		int age, ke;
		String go, yes="탑승가능", no="탑승 불가능";
		boolean aa, boho, gan;
		
		System.out.println("나이 입력하세요.");
		age=scr.nextInt();
		System.out.println("키 입력하세요.");
		ke=scr.nextInt();
		System.out.println("보호자 여부 입력하세요.");
		boho=scr.nextBoolean();
		System.out.println("건강 여부 입력하세요.");
		gan=scr.nextBoolean();
		
		aa=((age>=6 && ke>=130) || ke>=130 && boho) && gan;
		go=aa ? yes:no;
		
		System.out.println(go);
		
		
	}

}

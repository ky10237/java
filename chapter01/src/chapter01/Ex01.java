package chapter01;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money, n1, n2, n3, n4;
		Scanner scanner = new Scanner(System.in);
		
		money = scanner.nextInt();
		
		n4=money/500;
		money= money%500;
		n2=money/100;
		money= money%100;
		n3=money/50;
		money= money%50;
		n1=money/10;
		money= money%10;

		System.out.println("10원 잔돈은 "+n1+" 입니다.");
		System.out.println("50원 잔돈은 "+n3+" 입니다.");
		System.out.println("100원 잔돈은 "+n2+" 입니다.");
		System.out.println("500원 잔돈은 "+n4+" 입니다.");
		
		int a =5;
		int b=a++;
		System.out.println(a); //6
		System.out.println(b); //5
		System.out.println(++a); //7
		System.out.println(++b); //6
		System.out.println(++a + --b); //7+5=12
		System.out.println(a+b--); // 8+5=13
		
		
	}

}

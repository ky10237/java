package chapter02;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println(num+"은 ");
		
		if(num>=90 && num<=100)
		{
			System.out.println("A 입니다."); 
		}
		else if(num>=80 && num<=89)
		{
			System.out.println("B 입니다.");
		}
		else if(num>=70 && num<=79)
		{
			System.out.println("C 입니다.");
		}
		else if(num>=60 && num<=69)
		{
			System.out.println("D 입니다.");
		}
		else
		{
			System.out.println("F 입니다.");
		}
	}

}

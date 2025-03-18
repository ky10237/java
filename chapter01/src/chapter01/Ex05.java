package chapter01;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		int yun;
		
		
		System.out.print("알고 싶은 년도를 입력하세요: ");
		yun=scanner.nextInt();
		if(yun%4==0 && yun%100!=0 || yun%400==0)
		{
			System.out.println("윤년이 맞습니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}

		System.out.print("알고 싶은 년도를 입력하세요: ");
		String right="윤년이야", wrnog="윤년아냐";
		yun=scanner.nextInt();
		String a = (yun%4==0 && yun%100!=0 || yun%400==0)?right:wrnog;
		System.out.println(a);

		System.out.print("알고 싶은 년도를 입력하세요: ");
		String aa="윤년 ok", bb="윤년 no";
		boolean cc;
		yun=scanner.nextInt();
		cc = (yun%4==0 && yun%100!=0 || yun%400==0);
		String answer=cc?aa:bb;
		System.out.println(answer);
			
		
	}

}

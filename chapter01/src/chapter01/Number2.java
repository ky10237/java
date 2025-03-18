package chapter01;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a = {
				{10, 20, 30},
				{40, 50, 60, 70},
				{80, 90}
		};
		
		System.out.println("a[0]의 요소수"+a[0].length);
		System.out.println("a[1]의 요소수"+a[1].length);
		System.out.println("a[2]의 요소수"+a[2].length);
		
		String [] [] b = {
				{"강하늘","전지현"},
				{"강동원","김지원","서강준"},
				{"배윤지"}
	};
		System.out.println(b[0][1]+"을 캐스팅 하겠습니다.");
	
	String[] [] c= {
			{"kim","john"}
	};
	System.out.println(c[0][0]);
	System.out.println(c[0][1]);			
	System.out.println(c[0][0]+" "+c[0][1]);
	
	
	}

}

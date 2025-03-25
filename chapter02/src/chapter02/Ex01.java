package chapter02;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 65;
		
		System.out.println("당신의 점수는 "+a+"점 입니다.");
		
		if(a<70)
		{
			System.out.println("평균까지 앞으로"+(70-a)+"점 남았습니다.");
			System.out.println("힘내세요.");
		}
		else
		{
			System.out.println("잘 하셨습니다.");
		}
		
	}

}

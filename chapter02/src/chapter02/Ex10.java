package chapter02;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][][] a = {
				{						//ai
				{"배윤지","배윤삼","배윤칠"},
				{"김소정","김소삼","김소사"},
				{"김사랑","김사칠","김육사"}
				},
				{						//기공
				{"배윤","배삼","배칠"},
				{"김소","김삼","김사"},
				{"김랑","김칠","김사"}
				},
				{						//토목
				{"윤지","윤삼","윤칠"},
				{"소정","소삼","소사"},
				{"사랑","사칠","육사"}
				}
		};
		System.out.println(a[1][0][0]); //배윤 출력됨
		System.out.println(a[2][1][0]); //소정 출력됨
		System.out.println(a[0][0][1]); //배윤삼 출력됨
		System.out.println(a[0][0][2]); //배윤칠 출력됨
		System.out.println(a[1][2][1]); //김칠 출력됨
	
		System.out.println(a[1].length);
	
	}
}

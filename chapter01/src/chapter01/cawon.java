package chapter01;

public class cawon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a= {
				{10,20},
				{30,40},
				{50,60}
		};
		System.out.println("a[0][0]="+a[0][0]+" a[0][1]"+a[0][1]);
		System.out.println("a[1][0]="+a[1][0]+" a[1][1]"+a[1][1]);
		System.out.println("a[2][0]="+a[2][0]+" a[2][1]"+a[2][1]);
		
		String [][] b= {
				{"배윤지","이재현","이상연"},
				{"김영훈","이주연"},
				{"김선우","손영재"}
				};
		System.out.println("b[0][0]"+b[0][0]+" b[0][1]"+b[0][1]);
		System.out.println("b[1][0]"+b[1][0]+" b[1][1]"+b[1][1]);
		System.out.println("b[2][0]"+b[2][0]+" b[2][1]"+b[2][1]);
		System.out.println("ai학과의 3번째 학생 "+b[0][2]);
		}
	}



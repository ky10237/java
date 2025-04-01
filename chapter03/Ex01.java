package chapter03;


public class Ex01 {

	int month;
	int day;
	String sky;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 today = new Ex01();
		today.month=10;
		today.day=5;
		today.sky="맑음";
		
		System.out.println(today.month+"월"+today.day+"일"+today.sky);
		
	}

}

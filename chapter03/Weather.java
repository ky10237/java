package chapter03;
class Wdata{
	int month;
	int day;
	String sky;
}

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wdata today=new Wdata();
		Wdata yday=new Wdata();
		Wdata ttday= new Wdata();
		today.month=10;
		
		
		yday.day=4;
		yday.sky="흐림";
		System.out.println(today.month+"월 "+yday.day+"일 "+yday.sky);
		
		today.day=5;
		today.sky="맑음";
		System.out.println(today.month+"월 "+today.day+"일 "+today.sky);
		
		ttday.day=6;
		ttday.sky="눈옴";
		System.out.println(today.month+"월 "+ttday.day+"일 "+ttday.sky);
			}

}

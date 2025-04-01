package chapter03;
class bmw{
	int speed;
	String color, eg;
	
	void upSpeed(int value) {
		speed=speed+value;
	}
	
	void downSpeed(int value) {
		speed=speed-value;
	}
	

}
public class car {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bmw myCar1=new bmw();
		myCar1.color="검정";
		myCar1.speed=100;
		myCar1.eg="디젤";
		
		bmw myCar2=new bmw();
		myCar2.color="남색";
		myCar2.speed=120;
		myCar2.eg="전기";
		
		bmw myCar3=new bmw();
		myCar3.color="흰색";
		myCar3.speed=110;
		myCar3.eg="경유";
		
		System.out.println("자동차 1의 색상은 "+myCar1.color+"이며, 엔진은 "+myCar1.eg+"으로 충전, 현재 속도는 "+myCar1.speed+"입니다.");
		System.out.println("자동차 2의 색상은 "+myCar2.color+"이며, 엔진은 "+myCar2.eg+"으로 충전, 현재 속도는 "+myCar2.speed+"입니다.");
		System.out.println("자동차 3의 색상은 "+myCar3.color+"이며, 엔진은 "+myCar3.eg+"으로 충전, 현재 속도는 "+myCar3.speed+"입니다.");
	}

}

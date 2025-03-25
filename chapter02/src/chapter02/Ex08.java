package chapter02;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=5; a<=8; a++) {
			System.out.print(a+"/3="+a/3);
//			switch(a%3) {
//			case 1:
//				System.out.println(" : 나머지는 1입니다.");
//				break;
//			case 2:
//				System.out.println(" : 나머지는 2입니다.");
//				break;
//			default:
//				System.out.println(" : 나머지는 0입니다.");
//				break;
			
			if(a%3==1){
				System.out.println(": 나머지는 1입니다.");
			}else if(a%3==2) {
				System.out.println(": 나머지는 2입니다.");				
			}else {
				System.out.println(": 나머지는 0입니다.");
			}
			
		}
	}

}

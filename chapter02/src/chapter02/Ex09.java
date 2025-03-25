package chapter02;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i;
//		
//		for(i=0; ;i++) {
//			if(i%2==1){
//				continue;
//			}
//			if(i>10) {
//				break;
//			}
//		}
//			System.out.println(i);
//			
//			
//		i=10;
//		
//		while(i>0) {
//			System.out.println(i);
//			i-=2;
//		}
//		
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<3;j++) {
//				if(i==2) {
//					continue;
//				}
//				if(j==1) {
//					break;
//				}
//				System.out.println("A"+ i+j);
//			}
//		}
		
//		
//		int sum=0, aum=0;
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//			else {
//				aum+=i;
//			}
//		}System.out.println("짝수 합: "+sum+"\n"+"홀수 합: "+aum);
//		
		
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=i*10+j;
				System.out.println("a["+i+"]["+j+"] ="+a[i][j]);
			}
		}
	}
}

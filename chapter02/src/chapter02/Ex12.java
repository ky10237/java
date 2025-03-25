package chapter02;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {210,19,72,129,34};
		int b=a.length;
		int i,j,k;
		
		System.out.println("데이터 표시");
		for(i=0;i<b;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(j=0;j<b-1;j++) {
			for(i=j+1;i<b;i++) {
				if(a[j]>a[i]) {
					k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
		System.out.println("정렬 후");
		for(i=0;i<b;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}

}

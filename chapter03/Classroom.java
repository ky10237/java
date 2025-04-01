package chapter03;
class Test{   							//과목 정보
	String subject;  //과목 이름
	int point;		//과목 점수
	
	void setPoint(String s, int p) {	//과목 이름s와 점수p를 Test객체에 담음
		subject=s;
		point =p;
	}
	
	String getPoint() {					//과목: 점수 형식의 문자열로 만들어서 보여줌
		return subject +":"+point;
	}
}

class Student{							//학생 정보
	int id;			//학번
	String name;	//이름
	int subnum;		//과목 수
	Test[] test;	//Test클래스 배열 학생 수강 정보를 여러개 담을 수 있음
	
	Student(int i, String n, int s){ 	//초기 설정 생성자
		id=i;
		name=n;
		subnum=s;
		test= new Test[s];		//subnum 크기를 가진 test배열을 새로 만들어냄
		
		for(int j=0;j<s;j++) {		//배열의 각 요소에 test 객체를 새로 생성해 할당(빈 그릇에 test객체를 담는 것과 비슷)
			test[j]=new Test();
		}
	}
	
	String getName() {				//학생 이름: id를 만들어냄
		return id+":"+name;
	}
	
	int getGrade() {				//학생의 총점을 계산함
		int sum=0;
		for(int i=0; i<subnum;i++) {	//test배열의 각 과목 정보를 순회하면서 point 점수를 sum에 계속 더함
			sum+= test[i].point;
		}return sum;	//계산된 총점 반환
	}
	
	int getGrade(int a) {			//학생을 a단계로 평가해 반환
		int base =100*subnum/a;		//등급 나누는 기준값
		int rank=getGrade()/base+1;	//getGrade메소드 호출해 총점 얻고, base로 나누고 1 더해서 대략적인 등급을 정함
		return (rank>a)?a:rank;		//rank이 a보다 크면 a반환, 그렇지 않으면 계산된 등급 반환
	}
	
	void printScore() {					//학생 이름, 각 과목 점수, 총점, 등급 평가 결과를 화면에 출력
		System.out.println(getName());	//학생 이름 출력

		for(int i=0;i<subnum;i++) {						//각 과목 정보 순회하면서 다음 출력
			System.out.print(test[i].getPoint()+" ");//각 과목 이름, 점수 출력
		}
		System.out.println();
		System.out.println("총점"+getGrade());		//getGrade호출해 총점 출력
		int rank=5;									//평가 5단계 출력
		System.out.println(rank+"단계 평가"+getGrade(rank));
		
	}
}

public class Classroom {

	public static void main(String[] args) {
		
		Student kim=new Student(12,"김주현",3);
		kim.test[0].setPoint("국어", 95);
		kim.test[1].setPoint("영어", 83);
		kim.test[2].setPoint("수학", 76);
		kim.printScore();
		
		Student lee=new Student(7,"이 진",3);
		lee.test[0].setPoint("국어", 66);
		lee.test[1].setPoint("영어", 97);
		lee.test[2].setPoint("수학", 72);
		lee.printScore();
		
	}

}

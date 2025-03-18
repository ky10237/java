package chapter01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String right="맞음", wroog="틀림";
		boolean value;
		
		value =true;
		String answer =value? right: wroog;
		System.out.println(answer);
		
		value=false;
		answer = value? right:wroog;
		System.out.println(answer);
	
		
	
	}

}

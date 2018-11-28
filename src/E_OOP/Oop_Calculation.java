package E_OOP;

import java.util.Scanner;

public class Oop_Calculation {
	
	public static void main(String[] args){
		
		/*Calculation cal = new Calculation();
		cal.MyMath();
		*/ //void로 메쏘드를 만들어서
		Calculation.myMath();
	}
}


class Calculation{
	
	static void myMath(){
	
		for(int i = 1; i != -i ;i++){    //밑에와 상관없이 true값이 나오면 아래내용을 진행함.
		
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요");
			int result1 = sc.nextInt();
			System.out.println(result1);
			System.out.println("문자를 입력해주세요");
			String result2 = sc. next();
			System.out.println();
			if(result2.equals("x")){
				System.out.println("시스템이 종료되었습니다");
				break;	
			}
			System.out.println("숫자를 입력해주세요");
			int result3 = sc. nextInt();
			System.out.println(result2);
			
			if(result2.equals("*")){
				System.out.println(Calculation.multiply(result1,result3)); //스태틱 불러오는걸 써보고싶어서 해봤습니다...
																	  //(long)result1*result3  이건 그냥한거..
			}
			if(result2.equals("/")){
				System.out.println((float)result1/result3);
			}
			if(result2.equals("+")){
				System.out.println(result1+result3);
			}
			if(result2.equals("-")){
				System.out.println(result1-result3);
			}
		
		}
	
	}
	static int plus(int a, int b){
		int result = a+b;
		return result;
	}
	
	static int minus(int a, int b){
		int result = a-b;
		return result;
	}
	
	static long multiply(int c, int d){
		long result = (long)c*d;
		return result;
	}
	
	static float divide(int e, int f){
		float result = (int)((float)e/f*100+0.5f)/100f;
		return result;
	}
	
	
}


package C_sentence;

import java.util.Scanner;

public class Sentence_calculation {
	public static void main(String[] args) {
		/*
		 1. 숫자를 입력받는다.
		 2. 사칙연산을 입력받는다.(*,/,-,+)
		 3. 숫자를 입력받는다.
		 4. 1 2 3 = 출력
		 5. 단, 2번에서 x를 입력시 종료하세요.
		 
		 
		 String abc = '입력';
		 if(abc.equals("x"));
		
		 */
		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int result = sc.nextInt();
//		System.out.println(result);
//		
//		System.out.println("사칙연산을 입력받는다");
//		String result1 =sc.next();
//		System.out.println(result1);
//		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int result2 = sc1.nextInt();
//		System.out.println(result2);
//		
//		System.out.println(result+result1+result2+"="+result+ +result2);
//		
//		
//		
//		
//		
			for(int i = 1; i != -i ;i++){    //밑에와 상관없이 true값이 나오면 아래내용을 진행함.
			
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력해주세요");
				int result1 = sc. nextInt();
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
				System.out.println(result1*result3);
			}
			if(result2.equals("/")){
				System.out.println(result1/result3);
			}
			if(result2.equals("+")){
				System.out.println(result1+result3);
			}
			if(result2.equals("-")){
				System.out.println(result1-result3);
			}
			
		}
		
	}

}


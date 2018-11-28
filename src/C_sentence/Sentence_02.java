package C_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		 1. 반복문 ( for, while, do-while )
		   - 어떤 작업이 반복적으로 수행되도록 할때 사용된다.
		   - 반복문은 주어진 조건이 만족되는 동안 수행함으로 조건식을 포함한다.
		   - for문은 주로 반복횟수를 알고 있을때 while문은 반복횟수를 모를때 사용된다.
		   
		 
		 2. for문 
		  - 기본구조
		   for(초기화(시작);조건식(끝);증감식){
		   		수행될문장
		   
		   }     
		    초기 -> 조건식 -> 수행 -> 증감식 
		      -> 조건식 -> 수행 -> 증감식
		     
		 */
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);

		//초기화(시작) : int i = 0;
		//조건식(끝은 미포함)  : i<11
		//수행될 문장 : system.out.println(i);
		//증감식 : i++
		
////		for(int i=0; i<11; i++){//++은 앞에 붙여도되고 뒤에붙여도 같다.
////			System.out.println(i);
//		}
		
		for(int i = 0; i<11; i++){
			if(i%2 ==1){
				System.out.println(i);
			}
		}
		
		
		
//		Scanner sc = new Scanner(System.in); // 스캐너에 있는 클래스를 다시 가져오는것
//		                                    // new 새로운 주소를 가져오는것
//											// 시스템에서 가져올 준비를 해라 콘솔창에서 친걸 받아들일 준비를 하는것
//		System.out.println("숫자를 입력해주세요.");
//		
//	//	String str = sc.next();// 문자를 쳐라
//	//	System.out.println(str);
//		
//		int result = sc.nextInt();
//		System.out.println(result);
//		
//		
//		//1. 사용자로 부터 숫자를 입력받아서 0~입력받은수까지 출력해주세요
//		
//		for(int i = 0; i <= result ; i++){//i 중복해서 쓰기 가능 for문안에서만 가능하기 때문에
//			                              // i < result +1 == i <= result
//			System.out.println(i);
//		}
//		
		
		//1. 5~15까지의 합계를 구하세요
		
		int sum = 0;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		sum += 11;
		sum += 12;
		sum += 13;
		sum += 14;
		sum += 15;
		
		
		System.out.println(sum);
		
		
		for(int i = 5; i <16 ; i++){// i+=2
			sum += i ;
		}	
			System.out.println(sum);


		//2. 6~사용자가 입력한 수까지의 홀수의 합을 구하세요. (중복if문)
			
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int result = sc.nextInt();
		
		
		int sum2 = 0;
		sum2 +=6;
		sum2 +=7;
		sum2 +=8;
		sum2 +=9;
		
		
		int sum1 = 0;
		for(int i = 6; i<result+1; i++){
			if(i%2==1){
				sum1 += i;
			}
		}
		System.out.println(sum1);
		
		
		
		
		
		
		
		
		
		
	}
}

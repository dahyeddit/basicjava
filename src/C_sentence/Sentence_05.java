package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
		/*
		 1. while문
		  - 반복횟수를 모를때 사용한다.
		  - 조건식과 수행해야될 블럭{}으로 구성되어 있다.
		  - 구조
		    while(조건식){
		    
		    }
		 */
		
		//1. 3~33까지의 합계를 구하세요
		
//		int i = 3;
//		int total = 0;
//		while(i<34){
//			total += i;
//			i++;
//			
//		}
//		System.out.println(total);
//		
//		//2. 3~33까지의 짝수의 합계를 구하세요.
//		
//		int i2 = 3;
//		int total2 = 0;
//		while(i2<34){
//			if(i2 % 2 == 0){
//				total2 += i2;
//			}
//			i2++;
//		}
//		System.out.println(total2);
//		
//		//2. for문으로 구구단을 출력해주세요
//		for(int i3 =2; i3<10; i3++){
//			for(int j = 1; j<10; j++){
//				System.out.println(i3+"*"+j+"="+i3*j);
//			}
//		}
	
//		int x = 1;
//		while(x<9){
//			x++;
//			int y = 1;
//			while(y<10){
//				System.out.println(x+"*"+y+"="+x*y);
//				y++;
//			}
//			
//			
//		}

//		int x =2;
//		while(x<10){
//			int y = 1; // 변수는 자기가 필요할때 생성
//			while(y<10){
//				System.out.println(x+"*"+y+"="+x*y);
//				y++;
//			}
//			x++;
//		}
		
		// 짝수단의 홀수곱만 출력하세요.
//		int x2 = 2;
//		while(x2<10){
//			if(x2%2 ==0){
//				int y2 =1;
//				while(y2<10){
//					if(y2%2 ==1){
//						System.out.println(x2+"*"+y2+"="+x2*y2);
//					}
//					y2++;
//				}
//			}
//			x2++;
//		}
//		
//
//		int x2 = 2;
//		while(x2<10){
//			int y2 =1;
//			while(y2<10){
//				if(x2%2==0 && y2%2==1){
//					System.out.println(x2+"*"+y2+"="+x2*y2);
//				}
//				y2++;
//			}
//			x2++;
//		}
		
		//3. 1~? 더했을때 합계가 100이상이 되는가?
		int aa = 0;
		int sum = 0;
		
		while(sum <100){
			aa++;
			
			sum += aa;
			
		}
		
		System.out.println(aa);//aa
		
		//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		// 시작하는 숫자부터 끝나는 숫자중 5의 배수의 합계를 구하세요.
		// 단. while문을 이용하세요.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작하는 숫자를 입력하세요");
//		int sta = sc.nextInt();
//		System.out.println("끝나는 숫자를 입력하세요");
//		int fin = sc.nextInt();
//	
//		int summ =0;
//		while(sta<fin+1){
//			if(sta%5 == 0){
//				summ += sta;
//				
//				
//			}
//			sta++;
//		}
//		System.out.println(summ);
//		
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자를 입력하세요");
		int startNum = sc.nextInt();
		System.out.println("끝나는 숫자를 입력하세요");
		int endNum = sc.nextInt();
		
		int sum2 = 0;
		while(startNum < endNum +1){
			if(startNum%5==0){
			sum2 += startNum;
			}
			startNum++;
		}
		System.out.println(sum2);
		
		
		
		
		
	}
}

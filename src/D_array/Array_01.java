package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		 1.배열(array)이란?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는것.
		   ex) 5명의 점수
		    int score1 = 100;
		    int score2 = 50;
		    int score3 = 30;
		  	int score4 = 70;
		  	int score5 = 63;
		  
		 2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다.
			int[] a1; // int 타입의 형배열같아 보이니 자주써라
			int a2[]; // int 타입같으니까 쓰지말라			
		 */
		
		/*
		 3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배열생성을 위해서는 'new'와 함께 배열의 타입과 크기를 지정해 주면된다.
	
		 */
		
		
		int[] a = new int[3]; // int타입을 3개넣어라, 자바는 인덱스 개념이라서0부터시작
		
//		int[] a2 = new int[]{3,4,5}; // 시작하자마자 값을 주고싶을때
		int[] a2;
		a2 = new int[]{3,4,5};
		int[] a3 = {3,4,5};
		
		
//		int[] a3 = new int[]{3,4,5};// 한번에 할때는 new인트형이 생략되어서 쓸수있다.
//		int[] a3 = {3,4,5};
//		int[] a3;
//		a3 = {3,4,5}; // 방이없어서 안된다.
		
		int[] score = new int[4];
//		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);//4번방은없다 없는방달라하면 에러난다.

		
		
		for(int i =0; i<score.length; i++){
			System.out.println(score[i]);
		}
		
		
		//1. score의 0번째 방에 10을 저장해주세요
		
		score[0] = 10;
		
		//2. score의 1번째 방에 20을 저장해주세요
		
		score[1] = 20;
		
		//3. score의 2번째 방에 30을 저장해주세요
		
		score[2] = 30;
		//4. score의 3번째 방에 40을 저장해주세요
		
		score[3] = 40;
		
		
		for(int i = 0; i<score.length; i++){
			score[i] =(i+1)*10;
		}
		
		System.out.println("---------------------------------------------------");
		
		
		//1. 207호의 자바초급 점수를 저장할수 있는 변수를 선언 및 생성해주세요.
		
		int[] class207 = new int[17];
	
		//2. 각 사람의 점수를 0~100점사이의 랜덤한 정수값으로 저장해주세요.(랜덤하게 만들어서 점수 수작업하고 반복구문찍기)
		
//		class207[0] =(int)(Math.random()*101+0);
//		class207[1] =(int)(Math.random()*101+0);
//		class207[2] =(int)(Math.random()*101+0);
//		class207[3] =(int)(Math.random()*101+0);
//		class207[4] =(int)(Math.random()*101+0);
//		class207[5] =(int)(Math.random()*101+0);
//		class207[6] =(int)(Math.random()*101+0);
//		class207[7] =(int)(Math.random()*101+0);
//		class207[8] =(int)(Math.random()*101+0);
//		class207[9] =(int)(Math.random()*101+0);
//		class207[10] =(int)(Math.random()*101+0);
//		class207[11] =(int)(Math.random()*101+0);
//		class207[12] =(int)(Math.random()*101+0);
//		class207[13] =(int)(Math.random()*101+0);
//		class207[14] =(int)(Math.random()*101+0);
//		class207[15] =(int)(Math.random()*101+0);
//		class207[16] =(int)(Math.random()*101+0);
//		
//		
		for(int i = 0; i<class207.length; i++){
			class207[i] += (int)(Math.random()*101+0);
		}
		
		
		//2.5 각사람의 점수를 출력해주세요
		
		System.out.println(class207[0]);
		System.out.println(class207[1]);
		System.out.println(class207[2]);
		System.out.println(class207[3]);
		System.out.println(class207[4]);
		System.out.println(class207[5]);
		System.out.println(class207[6]);
		System.out.println(class207[7]);
		System.out.println(class207[8]);
		System.out.println(class207[9]);
		System.out.println(class207[10]);
		System.out.println(class207[11]);
		System.out.println(class207[12]);
		System.out.println(class207[13]);
		System.out.println(class207[14]);
		System.out.println(class207[15]);
		System.out.println(class207[16]);

		
		
		
		//3. 모든 사람의 점수의 합계를 구해주세요(출력)

		
//		int sum = 0;
//		for(int i = 0; i<class207.length; i++){
//			sum +=class207[i];
//		}
//		System.out.println(sum);
//		
		int sum = 0;
		sum += class207[0];
		sum += class207[1];
		sum += class207[2];
		sum += class207[3];
		sum += class207[4];
		sum += class207[5];
		sum += class207[6];
		sum += class207[7];
		sum += class207[8];
		sum += class207[9];
		sum += class207[10];
		sum += class207[11];
		sum += class207[12];
		sum += class207[13];
		sum += class207[14];
		sum += class207[15];
		sum += class207[16];
		
		
		//1.7개의 정수를 입력받아서 저장할수 있는 변수 input을 선언및 생성해주세요
		
		int[] input = new int[7];
		
		//2. 사용자로부터 입력받은 input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사용자로부터 정수를 입력받으세요");
//		int result = sc.nextInt();
//		
	
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<input.length; i++){
			System.out.println("사용자로부터 정수를 입력받으세요");
//			int result = sc.nextInt();
//			input[i] = result;
			input[i] = sc.nextInt();
		}
		
		
		//3. 출력
		for(int i = 0; i<input.length; i++){
			System.out.println(input[i]);
		}
		
		//4. 합계
		int sum4 = 0;
		for(int i = 0; i<input.length; i++){
			sum4 += input[i];
		}
		System.out.println(sum4);
		
		//5. 입력받은 7개의 평균 (소수점 3번째 자리에서 반올림해서 2번째자리까지 구하세요)
		
		float a1 = (int)((float)sum4/input.length*100+0.5f)/100f;
		System.out.println(a1);
		
		//6. 사용자가 입력한 수 중에 최댓값을 구하시오.
		
		
		int max = input[0];
//		if(max < input[1]){
//			max = input[1];
//		}
//		
//		if(max < input[2]){
//			max = input[2];
//		}
//		
//		if(max < input[2]){
//			max = input[2];
//		}
//		
//		if(max < input[3]){
//			max = input[3];
//		}
//		
//		if(max < input[4]){
//			max = input[4];
//		}
//		
//		if(max < input[5]){
//			max = input[5];
//		}
//		
//		if(max < input[6]){
//			max = input[6];
//		}
//		
//		if(max < input[7]){
//			max = input[7];
//		}
//		
		for(int i = 1; i<input.length; i++){
			if(max < input[i]){
				max = input[i];
			}
		}
		System.out.println(max);
		
		//7. 최솟값 구하기
		
		int min = input[0];
		
		for(int i = 1; i<input.length; i++){
			if(min > input[i]){
				min = input[i];
			}
			
		}
		System.out.println(min);
		
	
		
		 
		
		
		
		
		
		
		
	}
}
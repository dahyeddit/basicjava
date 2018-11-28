package A_varialbleBasic;

/**
 * doc 주석
 * @author pc10
 * @since 2018.10.30
 * 
 */
public class VariableBasic {//class 명
	public static void main(String[] args){//메소드명
		
		int 재은 = 10;//변수명
		
		// 한줄주석
//		한줄주석 ctrl+ shift+ c
//		
//		한
//		줄
//		주
//		석  블럭처리하면서  ctrl shift c누르면 된당
		
		/*
		 * 슬러시 *하고 엔터하면 *슬래시로 끝난다
		 * 
		 * 여러줄 주석
		 * 
		 * 
		 */
		
		/*
		  여러줄 주석 별없애기 싫으면 줄을 내려서 (엔터치지말고)
		 
		 */
		
		
		/*
		 1. 변수란?
		  - 단 하나의 값을 저장 할 수 있는 공간이다.
		 */
		
//		변수의 선언
		//[변수타입] [변수명];
		// 김           재은  ;
		int jae;
		jae = 10;
		
//		x = 10
		
		System.out.println(jae);
		
		
		//boolean jae; //지역안에  jae는 하나밖에 없음 자바는 위에서 아래 위에서 먼저 선언하면 쓸수있다
		
		// 기본형 참조형
		//boolean 재은
		
		//명명규칙
		//1. 대소문자를 구분을 하며 길이의 제한이 없다.
		int asd;
		int aSdajksdlfjasalkfj;//길이의 제한이 없지만 특수문자 안된다
		
		asd = 10;
		aSdajksdlfjasalkfj =10;
		
		//2. 예약어(key word, reserved word)는 사용할수 없다.
		// int pulbic class 등등/.///
		//int class; 사용불가 예약어라서 !~~
		
		
		//3. 숫자로 시작해서는 안된다.
		//int 10top;
		int t10op;
		
		//4. 특수문자 '_', '$'만 사용가능하다.
		int $harp;
	//	int s#arp;
		
		//필수는 아니지만 자바프로그래머의 암묵적 약속(가독성 상향)
		//1. 클래스명은 대문자로 시작해야 한다.
		//2. 여러단어로 이루어진 경우 첫번째 이후단어의 첫글자는 대문자로 쓴다.
		//lastIndexOf last+ index+ of
		//3. 상수의 명칭은 모두 대문자로 써야한다.
		// final int A = 10;
		// a = 20;( A는 10이다 a=20 은 
		//MAX_VALUE(언더바! 상수 두문자 붙여쓸때)
		//4. 한글은 사용하지 않는다.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

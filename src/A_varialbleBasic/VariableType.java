package A_varialbleBasic;

public class VariableType {
	public static void main(String[] args){
		/*
		 변수의 타입
		 
		 1. 기본형 타입(primitive type)
		   - boolean, char, (byte, short, int, long-정수형변수), float, double
		   
		 2. 참조형 타입(reference type)
		   - 주소를 저장한다. (4byte)

		 3. 종류
		  - 논리형 : true 와 false만을 값으로 받는다. 
		              조건식과 논리적 계산에 많이 사용한다. ex)boolean
		  - 문자형 : 문자를 하나 저장한느데 사용된다. ex)char
		  - 정수형 : 정수값을 저장하는데 사용한다. ex) byte, short, int, long
		  - 실수형 : 실수값을 저장하는데 사용한다. ex) float, double
		 
		 4. 크기 (1byte = 8bit)
		  -1byte : boolean, byte
		  -2byte : char, short
		  -4byte : int, float
		  -8byte : long, double
		  
		  5. 논리형 - boolean(기본값 false)
		    -boolean형 변수는 true와 false중 하나의 값을 저장할수있다.
		    -대답 (YES, NO), 스위치(ON/OFF)등의 논리구조에 주로 사용한다.
		    -1byte의 크기를 가진다.
		    

		 */
		
//		변수의 선언
//		[변수의 타입][변수명];
//		
		//true의 값을 저장할수 있는 변수의 power를 선언및 초기화 해주세요.
		
		boolean power;
		power = true;
		
		boolean wrong = false;
		
		
		/*
		 6.문자형 - char('\u0000')- 역슬레시유는 유니코드다. 
		  -문자 하나를 저장하는 용도로 사용된다.
		  -java는 Unicode문자 체계를 이용한다.
		  -2byte의 크기를 가진다.
		 */
		// code라는 변수에 'A'를 저장해 주세요.
		
		char code ='A';  // 한글자는 싱글쿼테이션, 두글자는 떠블쿼테이션
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code);
		System.out.println(code2);
		System.out.println(code3);
		
		int result= '뷁';
		System.out.println(result);
		
		
		/*
		 7.정수형 - byte, short, int, long
		 - 기본자료형은 int형이다.
		 - 변수에 저장하고자하는 정수값의 범위에 따라 4개중 하나를 선택해야한다.
		 
		 */
		
		//byte 타입의 변수 b1에 150의 값을 저장해주세요.
		 byte b1 = 100;
		 //9508312111111
		 
		 long num = 9508312111111L; //4바이트가 넘어가서 long타입이라고 알려줘야함 L붙여줘야한다.
		 
		 /*
		  8.실수형 - float(f붙여줘야함), double(더블은 기본형 뒤에 d를 안붙여도됨)
		  - 실수형 값을 저장한는데 사용된다.
		  - float : 1+8+23
		  - double : 1+11+52
		  */
		 //3.14159254863
		 
		 double pie = 3.14159254863;//소수점 10자리 이상쓰고 싶을때 더블
		 float f1 =3.14159254863f;
		 
		 System.out.println(pie);
		 System.out.println(f1);//소수점이 10자리 미만까지만 나옴
		 
		 
		
		double d2 = 0.5;//더블타입은 0.1~~라고 나옴
		float f2 = 0.5f;//플롯타입은 0,1그대로나옴
		
		System.out.println(d2 == f2);
		//2의 엔승으로 나와야 같은값이다. 0.1이면 다른값
		//노란줄이 있으면 같은값, 노란줄이 없으면 다른값
		
		/*
		 9. 문자열 - String(자바에서 지원해준 클래스명, 기본형처럼 쓸수있는 참조형)
		 
		 */
		
		String str = null; //공백가능 ,주소가 아직없다(참조형), 특수문자도 가능, 문자한정 없음, 
		                  //역슬레시는 불가능, 역슬레시 두번은 가능
		String str1 = "========____---000";
		System.out.println(str1);
		
		String str2 = "========\t____---000";// 역슬레시 t는 탭만큼 공백
		System.out.println(str2);
		
		String str3 = "========\n____---000";//한줄 뛰기
		System.out.println(str3);
		
		/*
		 10. overflow
		  - 자신이 표현할수있는 값을 넘어섰을때 최소값으로 돌아가는 현상
		 */
		
		byte b2 = 126;
		System.out.println(b2);//126
		b2++;//b2의 숫자에서 하나증가
		System.out.println(b2);//127
		b2++;
		System.out.println(b2);//-128
		b2++;
		System.out.println(b2);//-127
	
		/*
		 11. 형변환(casting)
		 - 기본형 간에는 서로 다른타입으로 변환이 가능하다.
		 byte -> short -> int -> long -> float -> double
		                   |      
		            char - -
		 
		 */
		
		int a2 = 130;
		byte b3 = (byte) a2; //캐스트연산자(형변환)
		System.out.println(b3);
		
		int a3 = 65;
		char c3 = (char) a3;
		System.out.println(c3);
		
		
		char c4 = 'B';
		int i4 = (int)c4;//오른쪽의 값을 왼쪽에 넣어줌
		                 //캐릭터타입을 인트로 변환 바꾸는쪽으로 써주는거
		
		long aa = 180;
		float ff = (float)aa;//나보다 더 큰범위에 갈수있으면 가능
		
		long DF = 180;
		float SD = DF;
		/*
		 12. 문자열 결함
		 */
		System.out.println(55+10);
        System.out.println("하이"+55);//스트링이 인트보다 더쎔 -> 55가 스트링으로 바뀜 (문자형) 
                                     //"하이" + "55"
        System.out.println("45"+20);// 사오이공 4520 이 아니다
        System.out.println("56"+"32");// 오육삼이 문자열 + 문자열 ( 큰타입을 따라간다 생각해라)
        System.out.println(""+45);//스트링 + 인트 스트링이 더쎄니까 문자로 '사오'가됨
		System.out.println(true+"34");//불린 + 스트링 스티링이 더쎄다
		System.out.println('T'+"G"+45);//캐릭터+스트링+인트 스트링이 쎄다 티쥐라는 스트링이된다 사오도 스트링이된다.
		System.out.println('A'+4+"44");//캐릭터+인트 = 인트 -> 69(인트) +44(스트링) ->6944(스트링) 
		
		//65
//		하이55
//		4520
//		5632
//		45
//		true34
//		TG45
//		6944
		
		
		
	}
	
}

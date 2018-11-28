package Y_exam;

public class exam_02 {
	public static void main(String[] args){
		
		/*
		 [2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
			크 기
			종 류
			       1 byte     2 byte    4 byte   8 byte
			논리형    boolean
			문자형                      char
			정수형      byte      short      int       long
			실수형                                    float     double
		 */
		
		/*
		 [2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
			(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
			초기화 하는 한 줄의 코드를 적으시오.
		 */
		
		long regNo = 9306172123123L;
		System.out.println(regNo);

		/*
		 [2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
			int i = 100;
			long l =100L;
			final float PI = 3.14f;
			- 리터럴 : 100, 100L, 3.14f
			- 변수 : i l PI
			- 키워드 : int long float final
			- 상수 : PI
		
		/*
		 [2-4] 다음 중 기본형(primitive type)이 아닌 것은? b
			a. int
			b. Byte - byte
			c. double
			d. boolean
		
		 */
		
		
		/*
		 [2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
			류’라고 적으시오.
			System.out.println(“1” + “2”) → ( ) => String + String = String 12
			System.out.println(true + “”) → ( ) => boolean + String => String + String => String "true"
			System.out.println(‘A' + 'B') → ( ) => char+char =>문자가 두글자면 더이상 char가 아니다 => int + int => int 유니코드 A = 65, B =66 65+66
			System.out.println('1' + 2) → ( ) => char 1의 유니코드는 49이다. char + int => int + int => 49+2 =51 
			System.out.println('1' + '2') → ( ) => char + char =>int +int => 49+ 50= 99
			System.out.println('J' + “ava”) → ( ) => char + String => String + String = Java
			System.out.println(true + null) → ( ) => 기본형과 참조형으로 나뉜다. 참조형의 기본값은 null이다. null-주소, 
			                                                            스트링만 특이하게 쓸수있다. 
			                                        null(주소,참조형)에 true(값,기본값)을 더할수없다.  
		                                             
		 *
		 *  jvm 은 연산할때 4byte
		 *  4byte보다 작은것들끼리 연산일때  int처리한다. 캐릭터 바이트 /바이트 쇼트/ 캐릭터 인트 -> 인트로 인지
		 *  4byte보다 큰것들끼리 연산할때는 큰것의 형태를 따라간다.(형변환)
		 * 'A' -> 65 '1'->49 'J' -> 74
		 *
		 */
		/*
			[2-6] 다음 중 키워드(예약어)가 아닌 것은?(모두 고르시오)b,c,d,e
				a. if - 자주색으로 뜸 , 반복문
				b. True - true
				c. NULL - null
				d. Class - class
				e. System - 자주색으로 안뜸
				
			[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)a,d,e,g
				a. $ystem - 특수문자 '$'가능
				b. channel#5 - #안됨
				c. 7eleven - 숫자 처음 안됨
				d. If -  if가 예약어
				e. 자바 - o 된다. 한글은 안됨(자바이용자들끼리 암묵적 규칙)
				f. new - 예약어
				g. $MAX_NUM - 상수대문자, 상수간 연결 '_',특수문자'$','_'
				h. hello@com - 특수문자는 '_', '$'
				
				a : 특수문자는 '_'와 '$'만을 허용한다.
				g : 상수는 대문자 , 특수문자 '_', '$'
				
			[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
				르시오)a, d
				a. int - 4byte
				b. long - 8byte
				c. short - 2byte
				d. float - 4byte
				e. double - 8byte
				
				참조형변수는 4바이트 -> int, float(4바이트), 
				
			[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)d,e
				byte b = 10;
				char ch = 'A';
				int i = 100;
				long l = 1000L;
				
				a. b = (byte)i; - int > byte 생략할수없다.
				b. ch = (char)b; - char는 음수를 포함하지 않는다.
				c. short s = (short)ch; - 범위가 다르다 
				                          short : 2바이트 -> 16비트
				                                  -2^15 ~ 2^15-1
				                           char : 2바이트 -> 16비트
				                                  문자형은 0부터시작이고 부호가 없어서 16비트를 다쓴다.
				                                  0 ~ 2^16-1 
				d. float f = (float)l; - float>long 생략가능
				e. i = (int)ch; - int > char
				
				byte->short->int->long->float->double
				              |
				       char----       
				              
				
				[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
				0~65535
				
				char->2byte->16bit
				문자형타입은 부호가없다. 음수가없다
				0~2^16-1

				[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)a,b, c,d
				a. byte b = 256; - byte 범위밖(-128~127)이라 초기화가 된다.
				b. char c = ''; - 띄어쓰기 있으면되고, 없으면 안된다(공백도 문자로 인지함)
				                  ''안에는 무조건 문자가 들어가야한다.
				c. char answer = 'no'; - 한글자만 싱글쿼테이션 두글자는 더블쿼테이션
				d. float f = 3.14 - float은 초기화 한 숫자뒤에 f써주기 f+loat f = 3.14f;
				e. double d = 1.4e3f; - float이 double보다 범위가 작아서 초기화값에 쓸수있다.
				                       double d = (double) 1.4e3f; (double)생략가능! 더블이 플롯보다 더 크기때문에 커버가능
				
				
				[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) c,e,f
				a. boolean - false
				b. char - '\u0000'
				c. float - 0.0 - 0.0f
				d. int - 0
				e. long - 0 - 0L
				f. String - "" - 기본값이 null이라서 틀림
	*/
		
	}
	
	

}

package E_OOP;

public class OOPBasic {
	public static void main(String[] args) {
		
		/*
		 1. OOP : Object - Oriented - Programming (객체지향프로그래밍)
		 
		 2. 객체지향언어
		  - 기존의 프로그래밍 언어에 몇 가지 새로운 규칙을 추가한 보다 발전된 형태이다.
		  - 규칙들을 이용해서 코드 간에 서로 관계를 맺어 줌으로써 보다 유기적으로 프로그램을 구성한다.
		  - 객체지향 언어의 특징
		   : 코드의 재사용성이 높다.
		   : 코드의 관리가 용이하다.
		   : 신뢰성이 높은 프로그래밍이 가능하다.
		   
		  3. 클래스와 객체
		   1) 클래스란?
		    - 객체를 정의해 놓은것이다.
		    - 객체의 설계도 또는 틀이다. 클래스 - 붕어빵틀, 객체 - 붕어빵
		    
		   2) 클래스의 선언
		    : [접근제어자][지정예약어] class 클래스명 [extends 클래스명] [implements 인터페이스]
		      public	abstract	class Child extends Parents  implements Serializable{}
		 
	       3) 객체란?
		   : 실제로 존재하는것, 사물 또는 개념
		   : Tv,다리미,책상,컴퓨터 등등
		   - 객체 구성요소
		    : 속성(멤버변수, 특성, 필드, 상태)
		     ex) 크기, 길이, 높이, 색상, 볼륨.....
		    : 기능 (메서드, 함수, 행위)
		     ex) 켜기,끄기, 볼륨높이기, .....
		 
		 
		   4.인스턴스란?
		   	- 클래스로부터 객체를 만드는 과정을 인스턴스화라고 한다.
		   	- Tv클래스로부터 만들어진 객체를 Tv클래스의 인스턴스 라고 한다.
		   	
		   	-인스턴스 생성방법
		   	 : 클래스명 변수명 ; => 클래스의 객체를 참조하기 위한 참조변수를 선언한다.
		   	 : 변수명 = new 클래스명(); => 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장한다.
		   	 : 인스턴스는 참조변수를 통해서만 다룰수있다. 참조변수의 타입은 인스턴스의 타입과 일치해야한다.
		   	 
		   5.선언위치에 따른 변수의 종류
		    - 지역변수, 전역변수(클래스변수,인스턴스변수)
		    - 클래스변수 
		     : 모든 인스턴스가 공통된 저장공간(변수)를 공유하게된다.
		     : 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 경우 클래스 변수로 선언한다.
		     : 인스턴스변수 앞에 static만 붙이면된다.
		     
		    - 인스턴스 변수
		     : 클래스의 인스턴스를 생성할때 만들어진다.
		     : 인스턴스의 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스화를 해야 한다.
		     : 인스턴스는 독립적인 저장공간을 가지므로 서로다른 값을 가질수 있다.
		     : 인스턴스마다 고유한 상태를 유지해야 하는 경우 인스턴스 변수로 선언된다.
		       	 
		   	- 지역변수
		   	 : 메서드내에 선언되며 메서드 내에서만 사용가능하다.
		   	 : 메서드 종료시 소멸된다.
		   	 
		   6. 메서드
		    - 어떠한 작업을 수행하기 위한 명령문의 집합
		    - 주로 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
		    - 입력값이 없을수도 결과를 반환하지 않을수도 있다.
		    - 반복적으로 사용되는 코드를 줄이기 위해서 사용한다.
		      => 유지보수가 쉬어진다.
		    - 작성방법
		    
		       반환타입 메서드명(변수타입 변수명,변수타입 변수명(여러개 무한정 선언가능))->메서드의 선언부{
		                                                        {}구현부 디클레어 영영사전
		       return;
		     } 
		     
		   7. return
		    - 메서드가 정상적으로 종료되는 경우
		      : 메서드의 블럭{}내의 마지막 문장까지 수행하였을때.
		      : 메서드의 블럭{}내에서 return문을 만났을때
		      
		    - 반환값
		      : 없는 경우에는 
		       => return; (생략가능)
		       => 반환타입은 void라고 써야한다.
		      : 있는 경우에는
		       => return 반환값;
		       => 반환타입과 반환값의 타입이 같아야한다.
		       
		            
		    8. 클래스멤버와 인스턴스 멤버간의 참조와 호출
		     - 같은 클래스의 멤버간에는 객체생성이나 참조변수 없이 참조할수 있다.
		     - 클래스 멤버들은 인스턴스 멤버들을 참조할 수 없다.
		     - 인스턴스 멤버가 존재하는 시점에는 클래스 멤버가 존재한다.
		     - 클래스 멤버가 존재하는 시점에는 인스턴스 멤버가 존재할수도있고 안할수도있다.(안할수있다를 기준으로 작성)
		     
		    9. 메서드 오버로딩
		     - 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것이다.
		     - 대표적인 예가 println()이다.
		     - 조건
		      : 메서드명이 같아야 한다.
		      : 매개변수의 개수 또는 타입이 달라야한다.
		      : 리턴타입은 관련이 없다.
		     - 장점
		      : 메서드 의 이름으로 구분되면, 한 클래스의 모든 메서드의 명은 달라야한다 -> 같게 쓸수 있어서 장점이다.
		      : 근본적으로 같은 기능을 하는 것인데 다른이름 표현되면 기억하기가 어렵다.
		      : 메서드의 이름을 짓는 고민을 덜수 있다.
		        
		    10. 매개변수
		     - 메서드를 호출할때 매개변수로 지정한 값(인자값)을 메서드의 매개변수에 복사하여 넘겨준다.
		     - 기본형 매개변수
		      : 단순히 저장된 값만 복사한다.
		      : 변수의 값을 읽기만 할수있다.
		      
		     - 참조형 매개변수
		      : 인스턴스의 주소가 복사된다.
		      : 변수의 값을 읽고 변경할수 있다.
		       
		    11. 메서드의 종류
		      - 클래스메서드
		       : 객체생성 없이 클래스명.메서드명()으로 호출한다.
		       : 인스턴스멤버와 관련없는 작업을 수행한다.
		       : 메서드 내에서 인스턴스 멤버를 사용할수 없다.
		       : 메서드 내에서 인스턴스 멤버를 사용하지 않는다면 static을 붙이는것을 고려한다.
		       
		      - 인스턴스 메서드
		       : 인스턴스를 생성 후 참조변수명.메서드명()으로 호출한다.
		       : 메서드 내에서 클래스멤버나 인스턴스멤버를 호출이 가능하다.
		    
		    12. JVM메모리 구조
		      - Method Area
		       : 프로그램 사용중 class가 사용되면 클래스의 정보를 저장한다.
		       : 클래스 메서드와 클래스 변수도 같이 저장된다.
		      - Call stack
		       : 메서드의 작업에 필요한 메모리공간을 제공한다.
		       : 메서드가 호출되면 호출스택에 호출된 메서드를 위한 메모리가 할당되며
		              메서드가 작업을 수행하는 동안 지역변수 들과 연산의 중간결과 등을 저장한다.       
		      - heap Area
		       : 인스턴스가 생성되는 공간이다.
		       : 인스턴스 메서드와 인스턴스 변수가 같이 저장된다.
		       
		    13. 재귀호출(recursive call)
		      - 매서드 내부에서 메서드 자기 자신을 다시 호출하는 것
		               
		   	14. 생성자 //Tv t = new Tv(); -> Tv()는 생성자
		   	  - 인스턴스가 생성될때 호출되는 인스턴스 초기화 메서드 이다.
		   	  - 특징
		   	   : 메서드처럼 클래스 내에 선언된다.
		   	   : 리턴값이 없다.
		   	    (생성자도 메서드 이기 때문에 리턴되는 값이 없으면 void를 반환타입에 적어줘야 하지만
		   	       모든 생성자는 리턴값이 없기 때문에 void를 생략한다.)
		   	   : 생성자의 명은 클래스명과 동일해야 한다.
		   	  - 정의방법
		   	   : 기본생성자
		   	      클래스명(){
		   	    
		   	    }         
		   	   : 매개변수가 있는 생성자
		   	       클래스명(변수타입 변수명, 변수타입 변수명.....){
		   	       
		   	     }  
		   	  
		   	15. 변수의 초기화
		   	  - 변수를 선언하고 처음으로 값을 저장하는것을 '변수의 초기화'라고 한다.
		   	  - 명시적 초기화 
		   	   : 변수의 선언과 동시에 초기화를 한다.
		   	   int a = 10;
		   	  - 생성자를 이용한 초기화
		   	  - 초기화 블럭 {} : 변수의 복잡한 초기화와 경우 사용된다.
		   	    : 클래스 초기화 블럭
		   	    : 인스턴스 초기화 블럭
		   	   
		   	  
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		 
		 
		 */
	}
}

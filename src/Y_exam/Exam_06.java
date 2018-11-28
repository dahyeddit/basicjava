package Y_exam;
////
////[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard
////클래스를 정의하시오.
//
////타 입 변수명 설 명
////int num 카드의 숫자.(1~10사이의 정수)
////boolean isKwang 광(光)이면 true, 아니면 false
//
//class SutdaCard{
//	int num;
//	boolean isKwang;
//	String result = "";
//	
//	SutdaCard(int num, boolean isKwang){
//		this.num =num;
//		this.isKwang = isKwang; 
//	}
//	
//	SutdaCard(){
//		num = 1;
//		isKwang = true;
//	}
//	
//	
//	
//	String info(){
//		if(isKwang == true){
//			result = "k";
//		}
//		return num + result;
//		
//	}
//	
//}




////[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
////결과와 같은 결과를 얻도록 하시오.
////[연습문제]/ch6/Exercise6_2.java
//class Exam_06 {
//	public static void main(String args[]) {
//		SutdaCard card1 = new SutdaCard(3, false);
//		SutdaCard card2 = new SutdaCard();
//		System.out.println(card1.info());
//		System.out.println(card2.info());
//	}
//	}
////[실행결과]
////3
////1K





//[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
//타 입 변수명 설 명
//String name 학생이름
//int ban 반
//int no 번호
//int kor 국어점수
//int eng 영어점수
//int math 수학점수

//[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
//getTotal()과 getAverage()를 추가하시오.
//1. 메서드명 : getTotal
//기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//반환타입 : int
//매개변수 : 없음
//2. 메서드명 : getAverage
//기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 : 없음
//[연습문제]/ch6/Exercise6_4.java


class Exam_06 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
//		Student s = new Student("홍길동",1,1,100,60,76);
//		System.out.println(s.info());
//	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(){
		
	}
	
	Student(String a, int b, int c, int d, int e, int f){
		name = a;
		ban = b;
		no =c;
		kor = d;
		eng = e;
		math = f;
		
	}
	
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		return (int)((float)(kor + eng + math)/3*100+0.5f)/100f;
	}
	
//	info(){
//		
//		
//	}
	
//}


//[실행결과]
//이름:홍길동
//총점:236
//평균:78.7


//[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
//[연습문제]/ch6/Exercise6_5.java
//class Exam_06 {
//	public static void main(String args[]) {
//	}
//}


//class Student {
//	
//}

//[실행결과]
//홍길동,1,1,100,60,76,236,78.7



//[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
//[연습문제]/ch6/Exercise6_6.java
//class Exercise6_6 {
//// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
//static double getDistance(int x, int y, int x1, int y1) {
///*
//(1) 알맞은 코드를 넣어 완성하시오.
//*/
//}
//public static void main(String args[]) {
//System.out.println(getDistance(1,1,2,2));
//}
//}
//[실행결과]
//1.4142135623730951






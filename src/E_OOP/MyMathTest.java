package E_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		
		MyMath.add();
		
		MyMath mm = new MyMath(); // MyMath형인 main()의 지역변수인 mm ;선언 됐다 ㅎㅎ = 지역변수인데 main()에 올라오면서 참조변수가 되고 그러므로써 참조변수가된다.
		mm.add2(1); //인자값 내가넘겨주는값 부르는값
		
		
		MyMath.add3(4, 4.5f);//클래스명. 메서드명
		
		//MyMath result2 = new MyMath(); 인스턴스화를 한번했는데 왜 또하냐
		mm.add4(1, 3, 'A'); //69
		
		
		int result = MyMath.add5(7); //57
		System.out.println(result);
		
		
		
		 
		int result2 = mm.add6(6, 3);
		System.out.println(result2); //3
		
		long result3 = mm.multiply(300000000,3000);
		System.out.println(result3);
	
		
		float result4 = mm.divide(202,8);
		System.out.println(result4);
		
		
	}
}

class MyMath{
	
	static int number = 50;
	
	static void add(){
		System.out.println(number * 2);
	}
	
	
	void add2(int a){// 매개변수(a) a값을받아서 맵핑을 해준다 매개를 해준다.
		System.out.println(number*a);
	}
	
	static void add3(int a, float c){
		System.out.println(a*c);
		return; //void일때 생략가능
	}
	
	void add4(int c, int d, char e ){
		System.out.println(c+d+e);
	}
	
	//클래스메서드명은 add5
	//매개변수는 int 하나
	//수행내용은 매개변수와 number의 합을 반환
	
	
	
	static int add5(int a){
		 return number+a;
	}
	
	//위와같은것
	//static int add5(int a){
	//int result = a + number; 계산된 타입이 어디에 담기는지 해야한다.
	//return result;
	
	
	int add7(int a, int b){
		int result = a+b;
		return result;
	}
	
	
	
	
	// 메서드명 add6
	// 매개변수 int 두개
	// 앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
	
	int add6(int a, int b){
		int result = a-b;
		return result;
	}
	
	// 인스턴스 매서드 multiply
	// int 값 두개
	// 두개의 수를 곱해서 반환해주세요
	// 단, overflow고려해주세요
	
	
	long multiply(int c, int d){
		long result = (long)c*d;
		return result;
	}
	
	//인스턴스 메서드 divide
	//int 값 두개
	//앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	//단, 소수점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
	
	float divide(int e, int f){
		float result = (int)((float)e/f*100+0.5f)/100f;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}



package E_OOP;

public class InitTest {
	public static void main(String[] args) {
		System.out.println(Init.action); //0 => 55 순서가 자동으로 클래스초기화로간다
										//명시적 초기화 => 클래스초기화 블럭
		
		Init it = new Init(); //15 => 20// 명시적초기화 => 인스턴스 초기화 블럭 => 생성자를 이용한 초기화
		System.out.println(it.action2); //20
		
		
		
	}
}

class Init{

	static int action;
	int action2 =15; //명시적 초기화
	int action3; //명시적 초기화
	
	Init(){ //기본생성자
		action2 = 20;
	}
	
	static { //클래스 초기화 블럭
		//많은 수식
		//메서드에 안올라간다.인스턴스에 안올라간다.
		//위에서볼때는 55로 초기화한걸로 인지한다.
		action = 55;
	}
	
	{ //인스턴스 초기화 블럭
		//많은수식
		action2 =100;
	}
	
	{
		//많은수식
		action3 = 150;
	}
	
	
	
	
	
	
}
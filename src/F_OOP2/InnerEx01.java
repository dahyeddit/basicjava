package F_OOP2;

public class InnerEx01 {
	//인스턴스 클래스
	class InstanceInner{
		int iv = 100;
//		static int cv = 200, iv; //사용불가
		
		final static int CONST = 200;//상수는 어디서든 사용가능
		
	}
	//스태틱 클래스
	static class StaticClass{
		static int cv = 500;
		int iv = 200;
		
	}
	
	void method(){
		//지역클래스 메서드내에서 쓰니까 메서드가 사라지면 끝난다.
		class LocalClass{
			int iv = 200; //인스턴스변수 가능 
//			static int cv = 500; //클래스 변수 불가능
			
		}
		
	}
	
	
	
	
	
	
}

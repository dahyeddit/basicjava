package F_OOP2;

import F_OOP2.Outer.Inner;

public class InnerEx02 {
	public static void main(String[] args) {
		
		//method()호출
		
		
		Outer o = new Outer();
		Outer.Inner in= o.new Inner();
		in.method();
		
		
		
		
		
	}
}


class Outer{
	
	int value = 10;
	
	class Inner{
		int value = 20;
		void method(){
			int value = 30;
			System.out.println(value); //30 지역 전역 부모의변수 의 순서
			System.out.println(this.value); //20
			System.out.println(Outer.this.value); //10
			
		}
		
		
		
		
	}
	
	
	
	
}




package E_OOP;

class Data{
	int x;
	
}

public class InterVari {
	public static void main(String[] args) {
		//1. Data의 객체를 만들어주세요. d1
		
		Data d1 = new Data(); //데이터형인 d1을 선언하고 d1은 메인메소드의 지역변수이다. 그리고 new데이터는 heap의 데이터변수가 인스턴스화 되고, 그리고 그 값을 d1의 인스터스화된 주소값을 넣고 d1은 참조변수가 되고 인스턴스가 되는거다. 객체생성
		
		//2. d1의 x값을 10으로 변경해주세요
		
		d1.x = 10; //d1은 데이터가 객체가된 주소를 가지고있다. 주소값.x -> 주소찾아가라. d1은 그 객체의 주소값을 가지고있다. 주소.x에 10을 넣은거다. 
		
		//3. 출력 :  => main()기본형 : d1의 x값
		
		System.out.println("main()기본형 : " + d1.x); //10
		
		//4. change(d1의 x값)
		
		InterVari mm = new InterVari();
		mm.change(d1.x); //10
		
		//4.5. 출력 :  => after main()기본형 : d1의 x값 // 여기까지 기본형 매개변수
		
		System.out.println("after main()기본형 : " + d1.x); 
		
		//5. Data의 객체를 만들어주세요. d2
		
		Data d2 = new Data();
		
		//6. d2의 x값을 10으로 변경해주세요
		
		d2.x =10;

		//7.출력 => main()참조형 : d2의 x값
		
		System.out.println("main()참조형 : " + d2.x); //10
		
		
		//8. change(d2)
		
		mm.change(d2);

		//8.5. 출력 :  => after main()참조형 : d2의 x값
		
		System.out.println("after main()참조형 : " + d2.x); //1000
		
		System.out.println(d1.x);//참조변수 d1에서 x를호출
		System.out.println(d2.x);
		
	
		
	}
	
	void change(int x){ //INTERVARI에 있는 인스턴스변수
		x = 1000;
		System.out.println("change()기본형 : " + x);
	}
	
	void change(Data d1){ //d1은 단지 변수명일뿐이다. 위의 d1과 상관없다.
		d1.x = 1000;
		System.out.println("change() 참조형 : "+ d1.x); //1000
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		fc.water();
		
		Car c = fc; // up-casting
		c.drive();// 믈뿌려는 사용할수없다.
		
		FireCar fc2 = (FireCar)c; //down-casting
		fc2.water();
		
		//먼저 파이어카 인스턴스를 만들고 카에 넣은거 그걸다시 파이어카에 넣은것
		
		
//		FireCar fc3 = (FireCar)new Car(); //터짐 카의인스턴스를 만들어도 파이어카에 바로 넣을수 없다.  
		//자식의 인스턴스를 먼저만들어야 둘다 가능 
	
	}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 가자");
	}
	
	void stop(){
		System.out.println("주차중 띠리리리리리리리리");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌려");
	}
}

class Ambulance extends Car{
	void AED(){
		System.out.println("200줄 차지");
	}
}






package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
//		System.out.println(c1.color);
//		System.out.println(c1.gearType);
//		System.out.println(c1.door);
		
		Car c2 = new Car("red",  "auto", 2);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		
		
		Car c3 = new Car("yellow", "auto");
		
		
		}
		
}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";  //c1.color일일이 하기 귀찮아서 기본생성자로 만들어주기
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType){
		this(); //생성자내부에서 다른생성자를 호출할때, 무조건 첫줄로 와야한다.
		this.color = color; //this가 이인스턴스에 있는 컬러 , 인스턴스 변수(전역변수라고 하지말고),// 전역변수 뒤에있는건 지역변수
		this.gearType = gearType;
		
	}

	Car(String color, String gearType, int door){
		this.color = color; //this가 이인스턴스에 있는 컬러 , 인스턴스 변수(전역변수라고 하지말고),// 전역변수 뒤에있는건 지역변수
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
	
}




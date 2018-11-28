package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
			System.out.println("fc는 FireCar의 인스턴스이다");
			FireCar fc2 = fc;
		}
		
		if(fc instanceof Car){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
			System.out.println("fc는 FireCar의 인스턴스이다");
			Car c2 = fc;
		}
		
		if(fc instanceof Object){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
			System.out.println("fc는 FireCar의 인스턴스이다");
			Object o2 = fc;//업캐스팅 생략
			
		}
		
		Car c = new Car();
		if(c instanceof Car){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
			System.out.println("c는 Car의 인스턴스이다");
			Car o2 = c;//업캐스팅 생략
		}
//		
//		if(c instanceof Object){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
//			System.out.println("c는 Object의 인스턴스이다");
//			Objcet o2 = c;//업캐스팅 생략
//		}
//		
		if(c instanceof FireCar){// fc는 파이어카를 포함하고 있느냐, fc라는 참조변수가 firecar의 객체냐 인스턴스냐
			System.out.println("c는 Object의 인스턴스이다");
			FireCar o2 = (FireCar)c;//형변환해서 이건 되는데 이프 조건절이 펄스라서 안됨
		}
		
	}
}

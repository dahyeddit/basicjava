package F_OOP2;

public class InterFaceTest {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		if(f instanceof Unit2){
			System.out.println("f는 Unit2의 인스턴스이다.");
			Unit2 u2 = f; //검사한 타입으로 형변환이 ㄷ가능하다.
		}
		
		if(f instanceof Fightable){
			System.out.println("f는 Fightable의 인스턴스를 구현했다.");
			Fightable f2 = f; //검사한 타입으로 형변환이 가능하다.
			//인터페이스 타입의 참조변수로 그를 구현한 구현체에 인스턴스를 참조할수있다.
		}
		
		if(f instanceof Movable){
			System.out.println("f는 Movable의 인스턴스를 구현했다.");
			Fightable f2 = f; //검사한 타입으로 형변환이 가능하다.
			//인터페이스 타입의 참조변수로 그를 구현한 구현체에 인스턴스를 참조할수있다.
		}
		
		
		
		
		
	}
}

class Unit2{
	int x;
	int y;
	int currentHp;	
}


interface Movable{
	void move(int x, int y);
	
}

interface Attackable{//공격방식이 달라서 인터페이스로 행위는 같지만
	void attack(Unit2 u);
	
}

interface Fightable extends Movable, Attackable{
	
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}
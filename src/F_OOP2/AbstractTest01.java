package F_OOP2;

public class AbstractTest01 {
	public static void main(String[] args) {
		
		
	}
}

abstract class Unit{
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop(){
		
	}

}


abstract class Marine extends Unit{
	void stimpack(){
		
	}
	
}

class Tank extends Unit{
	void changeMode(){
		
	}
	
	void move(int x, int y){ //오버라이드 사용해서 부모에있는 무브메서드 사용안해서 추상메서드를 가지지 않는다. 추상클래스 아니고 일반클래스됨
		
	}
	
	
}

class DropShip extends Unit{
	void load(){
		
	}
	
	void unload(){
		
	}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}





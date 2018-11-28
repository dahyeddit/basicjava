package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		//throwDice메서드를 호출하여라 3줄 인스턴스메소드 재귀호출로만들어라
		
		DoubleDice dd = new DoubleDice();//생성자가 하나도 없을때 만들어준다.
		int a = dd.throwDice();
		System.out.println(a);
		
	}
}

class DoubleDice{
	
	//인스턴스메서드 throwDice
	
	
	
	
	int throwDice(){ //매개변수 필요없음
	
		int a = (int)(Math.random()*6+1); //1번 주사위 랜덤
		System.out.println(a);
		int b = (int)(Math.random()*6+1); //2번 주사위 랜덤
		System.out.println(b);
		int sum = a+b;
		
		if(a==b){
			return sum + throwDice(); //sum += throwDice();
			
		}else{ 
			return sum;	
		}
	}
	
}






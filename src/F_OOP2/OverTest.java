package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str = og.upMethod();
		
		
		
		
	}
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이" +x+y;
	}
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override
	String upMethod(){// 오버라이딩은 부모에 있는 메서드를 재정의해서 쓴거
		return x+y+z+"오버라이드";
	}
	
	String upMethod(int k){ //오버로딩은 같은 이름의 매소드 여러개 만들어서 쓰는것
		return x + y + k + "오버로딩"; //super는 자식에서밖에 못씀.
 	}
	
	
	
	
	
	
	
}





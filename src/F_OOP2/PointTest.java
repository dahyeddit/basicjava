package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		
		
		
		
	}
}

class Point2{
	
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	

}




class Point3D extends Point2{
	
	int z;
	Point3D(int x, int y, int z){ // 변수는 : 지역 -> 전역 -> 부모
								  //메서드는 : 자식(지역과 전역이 없음) -> 부모
		super(x,y);//부모에있는 기본생성자 호출
		super.x =100; //this.x 도 같음 부모클래스의 인스턴스로 찾아감
		super.y =200;
		this.z = z;
	}
	
}









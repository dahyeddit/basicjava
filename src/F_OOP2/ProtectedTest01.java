package F_OOP2;

import E_OOP.ProtectedTest03;

public class ProtectedTest01 extends ProtectedTest03{//다른패키지에있는 자손클래스
	public static void main(String[] args) {
		
		ProtectedTest02 pt2 = new ProtectedTest02();
		ProtectedTest03 pt3 = new ProtectedTest03();
		
		ProtectedTest01 pt1 = new ProtectedTest01();//다른패키지의 자손클래스 데려올수있음,상속받은 메서드를 보호하기위해서, 단 포함관계는 쓸수없다. 상속일때만 사용가능
		
		
	}
}

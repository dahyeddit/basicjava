package E_OOP;

public class MemberCall {
	
	int iv = 10;
	static int cv = 100;
	
	int iv2 = iv;  //같은 인스턴스변수 같은힙메모리 들어갈수이있다.
	int iv3 = cv; // 클래스 변수니까 인스턴스화 한상태이다. 왼쪽먼저 생성 인스턴스 변수 생성 인스턴스화 될때만 생성된다. 인스턴스호 ㅏ되면 클래스 친구있다. 클래스가 있어야 인스턴스변수있다. 있으니까 존재해서 넣어주기
	
	static int cv2 = cv; // 클래스 생성되서 가능
	//static int cv3 = iv; //인스턴스가 아직 생성되지 않은상태라서 안된다.
	
	static void method(){
		cv = 500; // 클래스 메서드가 불러진 시점에 있어야 한다. cv이 이미 존재함
		//iv = 500; // 이시점에는 인스턴스 친구아직없어서 못부른다.
	}
	
	 void method2(){
		 cv = 1000; // 인스턴스친구를 부를려면 인스턴스화 해야하는데 이미 클래스는 로드되어있다. 그래서 가능
		 iv = 1000; // 인스턴스화가되어서 있는거면 iv도 있는거다 가능
	 }
	 
	 static void method3(){
		 method(); // 클래스 메소드니까 메소드 부를수있다.
	//	 method2();// 이클래스가 로드되어있는 시점에는 인스턴스 메소드가 없다
	 }
	 
	 void method4(){
		 method();
		 method2();
	 }
	
}

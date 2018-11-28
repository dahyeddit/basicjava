package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		
		//클래스변수 호출방법
		//클래스명.변수명
		
		String color1 = Tv.color; //클래스 변수 호출 //변수왼쪽 // 컬러라는 변수에 저장
		System.out.println(color1); // 널이찍힘
		Tv.color = "MAGENTA"; // 바로 출력할거라서 바로 부른거임
		System.out.println(Tv.color); // 마젠타로 바뀜
		
		Tv.changeColor(); //메서드 호출
		System.out.println(Tv.color); // 마젠타로 바뀜
		
		
		//Tv클래스의 인스턴스생성
		
		
		
		System.out.println("-------------------------------");
		//Scanner sc = new Scanner(); //스캐너를 만들어서 스캐너에 저장
		//int[] a = new int[];
		
		Tv t =new Tv(); //내가만드는것처럼 만들어짐  t는 참조변수 메인메서드를 기준으로 했을때는 메인메소드의 지역변수t
						// Tv타입의 참조변수 t //main()의 지역변수
		
		//참조변수명.변수명
		//1. t주소의 power를 출력해주세요
		
		System.out.println(t.power);
		
		//2. t주소의 power메서드를 호출해주세요
		
		t.power();
		
		//3. t주소의 power를 다시 출력해주세요
		
		System.out.println(t.power);
		
		//4. t주소의 채널을 16번으로 변경해주세요
		
		t.channel = 16;
		
		//5. t주소의 channelUp메서드를 호출해주세요
		
		t.channelUp();
		
		//6. t주소의 채널을 출력해주세요
		
		System.out.println(t.channel);
	}
}

	class Tv{//메서드안일때만 지역변수, 클래스안은 전역변수
		
		//전역변수
		//클래스변수 클래스만 있으면 부를수있다.
		static String color; // 색깔은 문자열로 들어있어야한다
		
		//인스턴스변수
		boolean power; // 전원을 관리하는것
		int channel; // 채널을 관리하기위한것
		
		//클래스메서드
		static void changeColor(){
			color = "green";		
		}
		
		//인스턴스메서드 인스턴스화해야 부를수있다.
		void channelUp(){
			channel++;
		}
		
		void power(){
			power = !power; // 불린타입의 기본은 false -> !power 는 켜짐
		}
		
		
	
	
}
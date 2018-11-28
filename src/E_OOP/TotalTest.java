package E_OOP;

public class TotalTest { // Method Area 에서 TotalTest클래스를 로드한다. 메소드에리어에는 클래스변수와 클래스 메서드친구들을 올린다. 
	public static void main(String[] args) {

		TvMaker.color = "Blue"; //대입연산자는 왼쪽에서 오른쪽부터 시작한다.
								//TvMaker 클래스를 메서드 에리어에 로드한다. .의 의미는 주소를 호출한다는의미
								//color라는 스태틱 인스턴스에 "Blue"를 넣어준다.
		TvMaker tm = new TvMaker();//대입연산자는 왼쪽에서 오른쪽부터 시작한다.
									//메서드 에리어에서 TvMaker가 로드됐는지 찾아보고 앞서 로드 됐으니 패스한다.
								   //메인메서드에있는 tm이라는 지역변수를 넣어준다. 
								  // new라는 연산자를 통해서 인스턴스화 하는것이다.
								 // heap에 tm의 주소를 생성 인스턴스 메소드와 인스턴스변수들을 찾아 넣어준다.
								//TvMaker()라는 기본생성자가 콜스택에 쌓였다가 ;를 찍고 퇴근한다.
		tm.age = 30; //tm의 주소에서 age를 호출한다. age의 기본값 0대신 30을 넣어준다.
		
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);//TvControll이라는 클래스를 메소드에리어에서 찾아준다.
											  //티비컨드롤이라는 클래스를 메소드에리어에 로드해준다.
											 //티비컨트롤의 클래스친구들이 클래스메소드와 클래스변수들을 찾아서 로드시킨다.(티비컨트롤클래스명으로가기)
											//티비컨드롤의 채널을 호출하는데 채널의 값은 15이다.
											// 콘솔창에 15가 찍힌다.
		
		TvControll.volumeDown();//티비컨트롤을 메서드에리어에서 찾아준다.이미 클래스친구들이 다올라가있다.
							   // 티비컨트롤에서 볼륨다운메스드를 호출해준다. 콜스택에 볼륨다운이 쌓인다.
							   // 16
							   // ;찍고 볼륨 다운퇴근
		System.out.println(TvControll.channel);  //티비컨트롤을 메서드에리어에서 찾아준다.이미 클래스친구들이 다올라가있다.
		   										// 티비컨트롤에서 채널을 호출한다.
												// 메서드 에리어에 있는 티비컨드롤의 채널값이 16으로 변경됐기 때문에
												//콘솔창에는 16을 출력한다.
		// 3.2
		TvControll tc; // 티비컨트롤을 메서드에리어에서 찾아준다.이미 클래스친구들이 다올라가있다.
					   // 티비컨드롤 클래스 객체에서 tc라는 참조형 변수 선언
					  // 메인메소드에 tc넣어준다.
		
		tc = new TvControll(); //인스턴스화 한다.
								// tc의 주소 가 힙에 생성
							   //티비컨트롤이라는 기본생성자가 콜스택에 올라감
							  //티비컨트롤클래스에서 tc의 주소에 인스턴스 친구들을 넣어준다. 인스턴스 메소드 인스턴스변수
							  
		System.out.println(tc.volume);//참조형변수tc에서 볼륨을 호출한다.	
									 //99를 콘솔창에 찍어준다.
		tc.volumeUp();//참조형변수 tc에서 볼륨업메소드를 호출한다.
					  //볼륨업메소드가 콜스택에 쌓인다.
					  //100
		System.out.println(tc.volume);//참조형변수 티씨에서 볼륨을 호출해라
									  //볼륨의 값이 100이므로 콘솔창에 100출력
									 
		tc.volumeUp();//참조형변수 tc에서 볼륨업메소드를 호출해라
					 //볼륨업메소드가 콜스택에 쌓인다.
					//101
		System.out.println(tc.volume);//참조형변수 티씨에서 볼륨을 호출해라
		  //볼륨의 값이 101이므로 콘솔창에 101출력

		//
		Calc cc = new Calc(); //Calc라는 클래스를 메서드에리어에 로드	
							 //클래스메서드와 클래스인스턴스를 불러온다
							//인스턴스변수들밖에 없어서 칼크만 로드된다.
							//메인메서드안에서 씨씨라는 지역변수가 생긴다.
							//뉴라는 인스턴스화를 통해서 힙영역에 cc의 주소가 생긴다.
							//씨씨라는 주소에 인스턴스 친구들 찾아준다.
							//인스턴스 메소드있고 인스턴스 변수 없다
							//add(int , int )
							//long add(long , int )
							//minus(int , int )
							//힙영역에 위의 3개 메서드를 넣어준다.
							// Calc()라는 기본형 메서드가 콜스택에 업로드된다.
							// = 을 통해서 힙영역의 씨씨주소와 콜스택에 있는 씨씨라는 지역변수 연결
							//;ㅣ 찍고 칼크메서드 퇴근
		System.out.println(cc.add(Integer.MAX_VALUE, 4));//씨씨라는 참조형변수에 에드라는 메소드 호출
													    //add(Integer.MAX_VALUE, 4 )를 콜스택에 쌓아준다.
														//매개변수
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1. 멤버변수
	// 1.1 클래스변수
	static String color; //TvMaker를 메소드에리어에 로드하고 클래스변수들을 찾아준다. 클래스변수 color와 inch
						//TvMaker라는 클래스에들어가는 클래스변수이다. String의 초기값은 null이다.
	static int inch;// TvMaker라는 클래스에들어가는 클래스변수이다. int의 초기값은 0이다.
	// 1.2 인스턴스변수
	String name = ""; //heap영역의 tm의 주소에 인스턴스변수인 name을 넣어준다. 기본값 null이 아니라 " "을적어준다.
	int age;//heap영역의 tm의 주소에 인스턴스변수인 age를 넣어준다. int의 기본값인 0을 넣어준다.

	// 2.
	// 2.1 인스턴스메서드
	TvMaker() { //heap영역의 tm의 주소에 TvMaker()를 넣어준다. 
		this("man", 25);
	}

	// 2.2 인스턴스메서드
	TvMaker(String name, int age) {//heap영역의 tm의 주소에 TvMaker(String, int)를 넣어준다.
									
		this.name = name; //this라는 전역변수  name을 호출 = 다음은 지역변수
		this.age = age; //this라는 전역변수  age을 호출 = 다음은 지역변수
	}
}

class TvControll { 
	final int MAX_VOLUME = 100; //힙영역 티씨주소에 
								//tc의 주소에  인스턴스 클래스 MAX_VOLUME을 올려준다.
								//final 절대 변하지 않는 상수값(int는 바뀜)
								//MAX_VOLUME = 100을 써준다.
	final int MIN_VOLUME = 0;//힙영역 티씨주소에
							//tc의 주소에  인스턴스 클래스 MIN_VOLUME을 올려준다.
							//final 절대 변하지 않는 상수값(int는 바뀜)
							//MIN_VOLUME = 0을 써준다.
	static final int MAX_CHANNEL = 50; //static이붙은건 클래스 친구들이다 클래스변수니까 TvControll클래스에 업로드 
									   // final 상수니까 int의 속성과 다르게 초기화해주어도 값이 변하지 않는다.
									  // MAX_CHANNEL = 50의 값이 계속 유지된다.
									  // 메서드에리어의 티비컨드롤 클래스안에 맥스채널 = 50이라고 설정해준다.
	static final int MIN_CHANNEL = 1;//static이붙은건 클래스 친구들이다 클래스변수니까 TvControll클래스에 업로드 
								   // final 상수니까 int의 속성과 다르게 초기화해주어도 값이 변하지 않는다.
								  // MIN_CHANNEL = 1의 값이 계속 유지된다.
								  // 메서드에리어의 티비컨드롤 클래스안에 민채널 = 1이라고 설정해준다.

	static int channel = 15; //static이붙은건 클래스 친구들이다 클래스변수니까 TvControll클래스에 업로드 
							  // 메서드에리어의 티비컨드롤 클래스안에 채널 = 15이라고 설정해준다.
	int volume = 99; //힙영역 티씨주소에
					//tc의 주소에  인스턴스 클래스 volume = 99을 올려준다.
					

	// 4. return문
	int volumeUp() {//힙영역 티씨주소에 //매개변수 없음
					//tc의 주소에  볼륨업 인스턴스메서드를 올려준다.
		if (volume == MAX_VOLUME) { //만약 볼륨과 맥스볼륨의 값이 같다면
			volume = MIN_VOLUME;// 볼륨에 민볼륨값을 넣어줘라
		} else {//그렇지않다면
			volume++;//볼륨의 값을 1 증가 해줘라
		}

		return volume; //볼륨에 반환 리턴타입 인트 
	}

	static int volumeDown() {//볼륨다운은 static이붙은 클래스메서드여서 메서드에리어 티비컨트롤에 클래스친구인 볼륨다운을 넣어준다. 
							 //매개변수가없다.
		if (channel == MAX_CHANNEL) { //먄약 채널이 맥스채널과 같다면 ==는 같다
			channel = MIN_CHANNEL; 	 //채널에 민채널을 넣어준다. =는 오른쪽에서 왼쪽으로 값을 넣어주는거
		} else { //그렇지 않다면
			channel++; //채널의 값을 높여줘라
					  // 채널의 값은 맥스채널도 민채널도 아니였다
					  // 따라서 채널이가지고있는 값 15에다가 +1을 해줘서 16이된다.
		}
		return channel; //채널을 반환하라 반환값이 인트라서 메서드명 앞에 반환타입 int를 써줌
	}				    //16을 반환해준다.
}

class Calc {
	// 5.인스턴스메소드
	int add(int a, int b) { //매개변수 타입 int 2개
		return a + b; //a+b를한 add메서드 반환값 인트타입으로 반환하는거임
		//오버로딩은 이름은같아도 변수타입다르거나 변수개수다르고 리턴타입은 상관이없다.
	}

	long add(long a, int b) {//매개변수 롱타입하나 인트타입하나
		return a + b; // 롱타입매개변수와 인트타입 매개변수를 더한값을 반환값 롱타입으로 반환하는거임
		//오버로딩은 이름은같아도 변수타입다르거나 변수개수다르고 리턴타입은 상관이없다.
	}

	int minus(int a, int b) {//매개변수 인트타입하나 인트타입하나
		return a + b;  //a+b를한 add메서드 반환값 인트타입으로 반환하는거임
					  //오버로딩은 이름은같아도 변수타입다르거나 변수개수다르고 리턴타입은 상관이없다.
	}
}
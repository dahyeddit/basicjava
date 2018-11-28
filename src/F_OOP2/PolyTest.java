package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. 스마트 티비 3대 저장하세요
		
		SmartTv[] st = new SmartTv[3];
		st[0] = new SmartTv();	
//		Tv st1 = new SmartTv();
//		st[0] = st1;
		
		st[1] = new SmartTv();
		st[2] = new SmartTv();
		
		//2. ThreeDTv 2대 저장하세요
		
		ThreeDTv[] tt = new ThreeDTv[2];
		tt[0] = new ThreeDTv();
		tt[1] = new ThreeDTv();
		
		//3. AfreecaTv 4대 저장하세요
		
		AfreecaTv[] at = new AfreecaTv[4]; 
		at[0] = new AfreecaTv();
		at[1] = new AfreecaTv();
		at[2] = new AfreecaTv();
		at[3] = new AfreecaTv();
		
		Tv[] t = new Tv[9];
		t[0] = (Tv)new SmartTv();//작은거에서 큰거로 간다 업캐스팅(생략가능)
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
	
		SmartTv st4 = (SmartTv)t[2];//큰거에서 작은거로 간다 다운캐스팅,자식을 먼저 만들고
		st4.internet();
		
	}
	
}
class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
	}
	
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}














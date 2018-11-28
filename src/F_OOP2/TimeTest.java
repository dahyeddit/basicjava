package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour); //4
		
		t.setMinute(150);
		int minute = t.getMinute();
		System.out.println( t.getHour() +" : "+minute); // 6:30
		
		t.setSeconds(10000);
		int seconds = t.getSeconds();
		System.out.println(t.getHour() +" : "+t.getMinute()+" : "+seconds); // 9:16:40
	}
}

class Time{
	private int hour;
	private int minute;
	private int seconds;
	
	void setHour(int hour){//디폴트,프로텍티드,퍼블릭 같은 패키지내
			this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
			this.minute = minute % 60;
			setHour(hour + minute / 60);	
	}
	
	int getMinute(){
		return  minute;
	}
	
	
	
	
	void setSeconds(int seconds){
			this.seconds = seconds % 60; //10000 / 60 -> 40초
			setMinute(this.minute+seconds/60); //this.minute = 30분 + 166 -> 196분이 setMinute()로 돌아감
	}                           
	int getSeconds(){           
		return  seconds;        
	}                           
	                            
	                            
	                            
}                               
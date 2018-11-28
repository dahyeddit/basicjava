package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
//		DrawShape ds = new DrawShape();
		DrawShape ds = new DrawShape("내가최고");
		
	}
	
	public void paint(Graphics g){
		//1. 원 객체를 만드세요
		//(매개변수 두개짜리 생성자를 이용해주세요)
		//150,150 50
		
		Point pp = new Point(150,150);
		Circle cc = new Circle(pp, 50);
		
		//2. 원을 그려주세요
		//g.drawOval(int,int,int,int)
		
		g.drawOval(cc.center.x, cc.center.y, cc.r*2 ,cc.r*2 );
		
		
		
		//3. 삼각형 객체를 만드세요
		// 매개변수 하나짜리 생성자를 이용해주세요
		// 100,100 200,200 200,100
		
//		Point ppp1 = new Point(100,100);
//		Point ppp2 = new Point(200,200);
//		Point ppp3 = new Point(200,100);
		
		Point[] p = {new Point(100,100),new Point(200,200), new Point(200,100)};
		Triangle a = new Triangle(p);

		//4. 삼각형을 그려주세요
		g.drawLine(a.p[0].x ,a.p[0].y ,a.p[2].x ,a.p[2].y );
		g.drawLine(a.p[1].x ,a.p[1].y ,a.p[2].x ,a.p[2].y );
		g.drawLine(a.p[0].x ,a.p[0].y ,a.p[1].x ,a.p[1].y );
		
		
		
	}
	
	
	DrawShape(){
		setTitle("진경아 열심히 하자");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.BLUE);
		setResizable(false);
		
	}
	
	DrawShape(String title){
		setTitle(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.green);
		setResizable(false);
	}
}

class Point{
	
	int x;
	int y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 점하나를 저장할수 있는 변수 center를 선언하세요
	
	Point center;
	
	//2. 반지름(정수)를 저장할수있는 변수 r을 선언하세요
	
	int r;
	
	//3. 매개변수가 두개인 생성자를 만드세요
    //   단 매개변수 두개로 center와 r을 초기화해주세요
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;	
	}
	
	//4. 기본생성자를 만들어 주세요
	//   단 매개변수가 두개인 생성자를 이용하여 점(50,50)으로 반지름을 100으로 만들어주세요
	
	Circle (){
		this (new Point(50,50), 100);//인스턴스가 된 주소의 객체가 된 누구의 주소값이 나온다. 
									//그값이 그친구이다. 포인트 클래스처럼 생긴놈이다.
									//그래서 그값을 데려가서 이거를 변수를 막 객체를 만드는게 아니라 저값을 떄려박는거다.
	}
}
	
class Triangle{
	//1. 점 세개를 저장할수 있는 변수 p를 선언 하세요
	
	Point[] p;
	
	//2. 매개변수가 하나인 생성자를 만드세요
	//   단 매개변수의 값으로 p를 초기화하세요
	
	Triangle(Point[] a){
		this.p = a;
	};
	
	//3. 매개변수가 세개인 생성자를 만드세요
	//   단 매개변수가 세개로 p를 초기화해주세요
	
	Triangle(Point a, Point b, Point c){
		this.p = new Point[]{a,b,c};
	};
	
	

}	
	
	








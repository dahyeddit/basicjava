package F_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV",700);
		System.out.println(t2);
		NoteBook nb = new NoteBook("Mac", 400);
		MicroWave mw = new MicroWave("LG전자렌지", 200);
		
		Buyer b = new Buyer("이상엽", 10000);
		
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
		
		//호갱님의 잔여금은 xxx이고 보너스 포인트는 xxx입니다.
		System.out.println("처음산 물품:"+b.item.get(0));
		System.out.println("호갱님의 남은돈 : " +b.money);
		System.out.println("호갱님의 포인트 : " +b.bonusPoint);
		//다사고 찍는거
		
		b.refund(t2);
		System.out.println(b.money);
		b.summary();
	}
}

class Product{
	
	String name;
	int price;
	int bonusPoint;
	
	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {
		return name;
	}
}

class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}


class Buyer{
	String name;
	int money;
	int bonusPoint;
	Vector item = new Vector();
//	Vector<Product> item = new Vector<Product>(); //이렇게 한번하면 형태가 프로덕트형태로 변해서 형변환 안해도된다.
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("꺼져");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다. ");
		item.add(p);
		System.out.println("호갱님의 잔여금은 "+money+"이고 보너스 포인트는"+ bonusPoint+"입니다.");
		//살때마다 찍을때
	}
	
	//1. 반품 refund메서드
	//   구매물품이 없으면 "구매하신 물품이 없습니다."
	//   구매물품은 있으나 우리 매장에서 산게 아니다.
	
	void refund(Product p){
		if(item.isEmpty()){
			System.out.println("구매하신 물품이 없습니다.");
		}
		else if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +"을/를 반품하셨습니다.");
		}else{
			System.out.println("우리 매장에서 산것이 아닙니다.");
		}
		return;//리턴을 안주면 노트북3개쓰면 3개다 사라진다.
		/*
		 if(item.contains(p)){
		 	반품하려고 하는 객체를 포함하고 있으면 true
			item.remove(p)
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +"을/를 반품하셨습니다.");
		 }
		 */
		/*
		 for(int i = 0; i<item.size();, i++){
		 	if(item.get(i) ==p){
		 		Product p2 = (Product)item.remove(i)//p를 넣어도됨 그러나 p에 있는물품이 3개면 한번에 3개 삭제됨
		 		money += p2.price;
		 		bonusPoint -= p2.bonusPoint;
		 		syso(p2 +"를 반품하셨습니다.");
		 		return;
		 	}
		 }	
		 */
		
		
		
		
	}
	
	
	//2. 영수증 summary메서드
	/*
	    	영   수  증
	 구매물품 LGTV       700만원
	       MAC        400만원
	       LG전자렌지     200만원
	 총 구매금액              1300만원
	 고객님의 남은돈          8700만원
	          포인트            130만점
	 또 오십시오 고객님~                
	 */
	
	void summary(){
		System.out.print("\t영수증");
		System.out.println();
		
		
		System.out.print("구매물품");
		int sum = 0;
		for(int i = 0; i<item.size() ;i++){
			Product p = (Product)item.get(i); //아이템은 벡터타입인데 프로덕트타입의 변수에 넣으려고 하니 형변환을 해주었다.
			sum += p.price;
			System.out.println("\t"+item.get(i)+"\t"+p.price+"만원");
			//((Product)item.get(1)).name + \t + ((Product)item.get(1)).price
			//sum += (Product))item.get(i)).price;
		}
		System.out.print("총 구매금액");
		
		System.out.println("\t\t"+sum+"만원");
		System.out.print("고객님의 남은돈");
		System.out.println("\t"+money+"만원");
		System.out.print("         포인트");
		System.out.println("\t"+bonusPoint+"만점");
		System.out.print("또 오십시오 고객님~");
	}
}

//3. 사람여러명을 관리할수 있는 클래스를 작성해주세요
//사람은 이름으로 구분



//4. 물품을 관리할수 있는 클래스를 만드세요





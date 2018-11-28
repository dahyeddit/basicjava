package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		
		
		int result1 = 1;
		for(int i = 4; i>0 ; i--){
			result1 *= i;
		}
		System.out.println(result1);
		
		
		
		
		
		long result = factorial(4);//RecursiveCall.factorial(4); 생략가능 같은 클래스내에있고 static 붙어서..?
		System.out.println(result);
	
	}
	
	static long factorial(int num){
		long result = 0L;
		if(num==1){
			result =1;
		} else{
			result = num * factorial(num-1);
		}
		
		return result;
		
	}
	
	
	
	
}

package D_array;

public class Arrya_lotto {
	public static void main(String[] args) {
		
		
		int[] lotto = new int[6];
		
		
		for(int line = 1; line<6; line++){
			
		
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				for (int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]){
						lotto[i] = (int)(Math.random()*45+1);
						j--;
						
					}
				}
			}			
			
			for(int i = 0; i<lotto.length; i++){
				System.out.print(lotto[i]+" ");
		
			}
			System.out.println("");
		}	

		
	}
		
		
		
}



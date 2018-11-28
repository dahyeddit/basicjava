package D_array;

public class Array_04 {
	public static void main(String[] args) {
		
		//1. 6명의 7과목을 저장할수 있는 변수 score를 선언 및 생성해주세요
		
		String[] stu = new String[]{"연욱","초연","진경","미란","재은","은우"}; //사람이름6명을 넣을수있는 변수명만들고
		
																		//변수에 사람이름넣고(주변이름으로 초기화)
		
		String[] sub = new String[]{"국어","영어","수학","사회","과학","오라클","자바"}; //과목 변수명, 과목초기화
		
		
		int[][] score = new int[stu.length][sub.length];
		
		
		//2. score의 각방을 0~100점사이의 랜덤한 정수값으로 저장해주세요
		

		for(int i = 0; i<score.length; i++){ // 점수
			for(int j = 0; j<score[i].length; j++){
				score[i][j] = (int)(Math.random()*101+0);
			}	
		}
		
		
		int[] sum = new int[stu.length]; //합계
		for(int i = 0; i<score.length; i++){
			for(int j = 0; j<score[i].length; j++){
				sum[i] += score[i][j]; 
			}
		}
		
		float[] avg = new float[sub.length]; //평균
		for(int i = 0; i<stu.length; i++){
			avg[i] = (int)((float)sum[i] /sub.length*100+0.5f)/100f;
		}
		
		
		int[] subsum = new int[sub.length]; //과목합계
		for(int i = 0; i<sub.length; i++){
			for(int j = 0; j<score.length; j++){
				subsum[i] += score[j][i]; 
			}
		}
		
		float[] subavg = new float[sub.length]; //과목평균
		for(int i = 0; i<sub.length; i++){
			subavg[i] = (int)((float)subsum[i]/stu.length*100+0.5f)/100f;
		}
		
		int[] rank = new int[stu.length];
		for(int k = 0; k<stu.length; k++){
			rank[k] = 1;
		}
		for(int i = 0; i<stu.length; i++){
			for(int j = 0; j<stu.length; j++){
				if(sum[i] < sum[j]){
					rank[i]++;
				}
				
			}
		}
		
	
		//0. 아래와 같이 출력해주세요
		for(int k = 0; k<sub.length; k++){ // 과목명 출력
			System.out.print("\t"+sub[k]);
		}
		
		System.out.print("\t"+ "합계");

		System.out.print("\t"+ "평균");
		
		System.out.println("\t"+ "랭킹");
		
		
		for(int i = 0; i<score.length; i++){
			System.out.print(stu[i] + "\t"); //사람이름 출력하기
			
			for(int j = 0; j<score[i].length; j++){
				System.out.print(score[i][j] +"\t");
			}	
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i]+"\t");
			System.out.println(rank[i]);
		}
		
		System.out.print("과목합계"+ "\t");
		
		for(int j = 0; j<sub.length; j++){
			System.out.print(subsum[j] + "\t");
		}
		
		System.out.println();
		
		System.out.print("과목평균"+"\t");
		for(int i = 0; i<sub.length; i++){
			System.out.print(subavg[i]+ "\t");
		}
		
		
//		int sum = 0;
//		for(int i =0; i<score.length; i++){
//			for(int j = 0; j<score[i].length; j++){
//				System.out.print(score[i][j] + "\t");
//			}
//		}
		
		//1. 사람이름6명을 넣을수있는 변수명만들고, 변수에 사람이름넣고(주변이름으로 초기화), 출력하기
		
		

	}

}
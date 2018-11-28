package D_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
	/*
	 1. 정렬
	  - 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들으 가지런히 나열하는 작업
	  - 버블정렬, 삽입정렬, 선택정렬
	 2. 버블정렬(bubble sort)
	  - 인접한 데이터간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
	  - 회전이 진행됨에 따라 가장 큰값이 뒤로 보내진다.
	  
	  3. 선택정렬(Select sort)
	  - 정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다.
	  - 회전이 진행됨에 따라 가장 작은값이 앞에 확정된다.
	 */
	
	// 1. 5,2,3,1,4숫자 5개숫자를 저장할수 있는변수를 선언 및 생성하세요.
//		
//		int[] bub = new int[]{5,2,3,1,4};
		
	// 2. 1회전 진행한다.
//		
//		if(bub[0]>bub[1]){
//			int seat = bub[0];
//			bub[0]= bub[1];
//			bub[1]= seat;
//		}
//		System.out.println(bub[0]);
//		
//		if(bub[1]>bub[2]){
//			int seat = bub[1];
//			bub[1] = bub[2];
//			bub[2] = seat;
//		}
//		System.out.println(bub[1]);
//		
//		if(bub[2]>bub[3]){
//			int seat = bub[2];
//			bub[2] = bub[3];
//			bub[3] = seat;
//		}
//		System.out.println(bub[2]);
//		
//		if(bub[3]>bub[4]){
//			int seat = bub[3];
//			bub[3] = bub[4];
//			bub[4] = seat;
//		}
//		System.out.println(bub[3]);
//		System.out.println(bub[4]);
//	
		//1회전
//		for(int i =0; i<bub.length-1; i++){
//			if(bub[i]>bub[i+1]){
//				int seat = bub[i];
//				bub[i] =bub[i+1];
//				bub[i+1]= seat;
//			}
//		}
//		for(int i = 0; i<bub.length; i++){
//			System.out.print(bub[i] + " ");
//		}

		
//			for(int i = 0; i<bub.length-1; i++){
//				for(int j = 0; j<bub.length-1; j++){
//					if(bub[j]>bub[j+1]){
//						int seat = bub[j];
//						bub[j] = bub[j+1];
//						bub[j+1] = seat;
//					}
//				}	
//				for(int k = 0; k<bub.length; k++){
//					System.out.print(bub[k] + " ");
//				}
//				System.out.println("");
//			}
		
	
		int[] a = new int[]{5,2,3,1,4};
		for(int k = 0; k<a.length-1;k++){
			System.out.println(k+1+"회전");
			for(int i =0; i<a.length-1-k; i++){
				if(a[i]>a[i+1]){
					int tmp = a[i];
					a[i]=a[i+1];
					a[i+1]=tmp;
				}
				for(int j=0; j<a.length; j++){
					System.out.print(a[j]+"");
				}
				System.out.println();
			}
		}
			
		
		
		
		//선택정렬
		
		int arr[] = new int[]{5,2,3,1,4};
		
		int min = arr[0];
		int minBang = 0;
		for(int i =1; i<arr.length; i++){//2번방부터해도된다
			if(min>arr[i]){
				min = arr[i];
				minBang = i;
			}
		}
		
		int temp = arr[0];
		arr[0] = arr[minBang];
		arr[minBang] = temp;
		System.out.println(Arrays.toString(arr));
		
		//2회전
		min = arr[1];
		minBang = 1;
		for(int i = 1; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
				minBang = i;
			}
		}
		
		temp = arr[1];
		arr[1] =arr[minBang];
		arr[minBang] = temp;
		System.out.println(Arrays.toString(arr));
		
		//3회전
		min = arr[2];
		minBang = 2;
		for(int i = 2; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
				minBang = i;
			}
		}
		
		temp = arr[2];
		arr[2] =arr[minBang];
		arr[minBang] = temp;
		System.out.println(Arrays.toString(arr));

		//4회전
		min = arr[3];
		minBang = 3;
		for(int i = 3; i<arr.length; i++){
			if(min>arr[i]){
				min = arr[i];
				minBang = i;
			}
		}
		
		temp = arr[3];
		arr[3] =arr[minBang];
		arr[minBang] = temp;
		System.out.println(Arrays.toString(arr));

		
		//답
//		for(int j = 0; j<arr.length-1; j++){
//			int min = arr[j];
//			int minBang = j;
//			for (int i = j+1; i<arr.length; i++){
//				if(min >arr[i]){
//					min = arr[i];
//					minBang = i;
//				}
//			}
//			int tmep = arr[j];
//			arr[j] = arr[minBang];
//			arr[minBang] = temp;
//			System.out.println(Arrays.toString(arr));
//			
//		}
//		
//		
		
		
//		for(int i = 0; i<arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];
//			}
//		}
//		
//		//1회전
//		if(arr[0]>min){
//			int tmp = arr[0];
//			arr[0] = min;
//			min = arr[0];
//			System.out.println("선택정렬1회전 : "+arr[0]);
//		}
//		
//		//2회전
//		if(arr[1]>min){
//			int tmp = arr[1];
//			arr[1] = min;
//			min = arr[1];
//			System.out.println("선택정렬2회전 : "+arr[1]);
//		}
//		
//		//3회전
//		if(arr[2]>min){
//			int tmp = arr[2];
//			arr[2] = min;
//			min = arr[2];
//			System.out.println("선택정렬3회전 : "+arr[2]);
//		}
//		
		
	
		
	}
		
		
		
		
	
}

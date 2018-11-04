package xxx;

import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
		int[] array = new int[3];
		System.out.println("請輸入三邊長:");
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		
		temp = array[2];
		array[2] = array[max(array)];
		array[max(array)] = temp;
		
		if(array[2] > array[0]+array[1] || array[0] <= 0 || array[1] <=0 || array[2] <=0) 
			System.out.println("不4三角形");
		else if(Math.pow(array[2], 2) == Math.pow(array[1], 2)+ Math.pow(array[0], 2) ) 
				System.out.println("直角三角形");
		else if(array[2] == array[0] && array[0] == array[1] ) 
			    System.out.println("正三角形");
		
		else if(array[2] == array[0] || array[0] == array[1] || array[1] == array[2]) 
				System.out.println("等腰三角形");
		else System.out.println("其他三角形");
			
		}
	
	
	
	
	
	
	public static int max(int[] array){
		
		
		int max = 0, c = 0;
		for (int i=0; i< array.length; i++) {
			if(array[i]>max) {
				max = array[i];
						c = i;				
			}
		}
		return c;	
	}
}

package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hw5 lai = new Hw5();

		System.out.println("HW5-1: 請輸入長方形的寬與高(用空格或enter鍵隔開)");
////////////////////////////////////////////////////////////////////////////
//		Scanner s1 = new Scanner(System.in);								
//		lai.starSquare(s1.nextInt(), s1.nextInt());							
////////////////////////////////////////////////////////////////////////////
		System.out.println("HW5-2:產生10個0~100之亂數，並算其平均");	
////////////////////////////////////////////////////////////////////////////
//		lai.randAvg();
////////////////////////////////////////////////////////////////////////////
		System.out.println("HW5-2:兩個overloading方法，求二維振烈最大值");
////////////////////////////////////////////////////////////////////////////
//		int[][] intArray = {
//				{1, 6, 3},
//				{9, 5, 2}
//		};
//		double[][] doubleArray = {
//				{1.2, 3.5, 2.2},
//				{7.4, 2.1, 8.2}
//		};
//		System.out.println(lai.maxElement(intArray));
//		System.out.println(lai.maxElement(doubleArray));
////////////////////////////////////////////////////////////////////////////
		System.out.println("HW5-進階:輸出8個亂數驗證碼，包括數字、英文大小寫");
////////////////////////////////////////////////////////////////////////////
//		lai.genAuthCode();
////////////////////////////////////////////////////////////////////////////
	}
	
	
	public void genAuthCode() {
		System.out.println("本次隨機產生的驗證碼為:");
		for (int i =1; i <= 8; i++) {
			int index = (int)(Math.random()*3)+1;
			switch (index) {
			case 1:
				System.out.print((int)(Math.random()*10));
				break;
			case 2:
				System.out.printf("%c", (int)(Math.random()*26)+65);
				break;
			case 3:
				System.out.printf("%c", (int)(Math.random()*26)+97);
				break;
		}
		}
	}
	
	
	
	public int maxElement(int x[][]) {
		int max = -9999;
		for(int i =0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if(max < x[i][x[i].length-1]) {
				max = x[i][x[i].length-1];
			}	
		}
		return max;
	}
	
	public double maxElement(double x[][]) {
		double max = -9999;
		for(int i =0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if(max < x[i][x[i].length-1]) {
				max = x[i][x[i].length-1];
			}		
		}
		return max;
	}
	
	
	
	
	
	
	public void randAvg() {
		int sum = 0;
		int num;
		for (int i =1; i <= 10; i++) {
			num = (int)(Math.random()*101);
			sum+=num;
			System.out.print(num+"\t");
		}
		System.out.println();
		System.out.println("平均為:\t"+sum/10);
	}
	
	
	
	
	
	public void starSquare(int width, int height) {
		for(int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
				
	}

}

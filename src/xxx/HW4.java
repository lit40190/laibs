package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		HW4 lai = new HW4();
///////////////////////////HW4-1/////////////////////////////////		
//		int x[]= {29, 100 ,39, 41, 50, 8, 66, 77, 95, 15};
//		System.out.println("此陣列平均值為:"+lai.getAvg(x));
//		System.out.print("大於平均值的數有:\n");
//		for(int i =0; i < x.length; i++)
//			if(x[i] > lai.getAvg(x))
//				System.out.print(x[i]+"\t");
////////////////////////////////////////////////////////////////
		
		
		
///////////////////////////HW4-2////////////////////////////////		
//		String s = "Hello World";
//		lai.inverse(s);
////////////////////////////////////////////////////////////////

		
		
/////////////////////////HW4-3//////////////////////////////////		
//		String star[] = {"mercury", "venus",  "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//				System.out.println(lai.vowel(star, 'a')+lai.vowel(star, 'e')+lai.vowel(star, 'i')+lai.vowel(star, 'o')+lai.vowel(star, 'u'));
///////////////////////////////////////////////////////////////
		
				
				
//////////////////////////HW4-4////////////////////////////////		
//		int[][] money = {
//				{28, 32, 8, 19, 27},
//				{2500, 800, 500, 1000, 1200}				
//		};
//		System.out.println("要借多少你說R\n");
//		Scanner sc0 = new Scanner(System.in);
//		lai.checkMoney(money, sc0.nextInt());
///////////////////////////////////////////////////////////////
		
		
		
/////////////////////////HW4-5////////////////////////////////
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("請輸入YYYY年MM月DD日:\n");
//		lai.checkNum(sc1.nextInt(), sc1.nextInt(), sc1.nextInt());
		
////////////////////////////////////////////////////////////////		
		

		
///////////////////////HW4-6////////////////////////////////////		
		int[][] ca={
				{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}
				};
		//545645645645645645646
		
		int ca3[][] = new int[6][8];		
		for(int i = 0; i < ca.length; i++) {
		ca3[i] =Arrays.copyOf(ca[i], ca[i].length);
		Arrays.sort(ca3[i]);
		}
		
				
		for (int i = 0; i< 6 ;i++) {
			for (int j =0; j < 8; j++)
				System.out.print(ca3[i][j]+"\t");
		System.out.println();
		}
		
	
			

		System.out.println("Using Time:" + (System.currentTimeMillis() - startTime) + " ms");
		
		
//		int king[] = lai.grade(ca);
//		for (int i =0 ; i < king.length; i++)
//			System.out.print(i+1+"號，成績最高共計"+king[i]+"次\n");
////////////////////////////////////////////////////////////////
			
	}
	
	
////////////////////////////////方法如下///////////////////////////////////
////////////////////////////////方法如下///////////////////////////////////
////////////////////////////////方法如下///////////////////////////////////
	
	
	
	
/////////////////HW4_1 算平均///////////////////////////////	
	public double getAvg(int[] array) {
		int sum=0;
		double avg;
		for(int i =0; i < array.length; i++)
			sum+=array[i];
		avg = (double)sum/array.length;
		return avg;
	}
//////////////////////////////////////////////////////////
	
/////////////////HW4_2反轉字串///////////////////////////////	
	public void inverse(String sant) {
		String in = "";
		for(int i = sant.length()-1; i >=0; i--)
			 in += sant.charAt(i);		
		System.out.println(in);
		
	}
///////////////////////////////////////////////////////////	
	
/////////////////HW4_3 大家來找八大行星碴	///////////////////////////////	
	public int vowel(String[] k, char vowel) {
		int count = 0;
		for(int i =0; i < k.length; i++)
			for(int j =0; j < k[i].length(); j++)
				if (k[i].charAt(j) == vowel) 
					count++;
		return count;
	}	
///////////////////////////////////////////////////////////////////
	
/////////////////HW4_4 誰可以借我錢霸脫///////////////////////////////	
	public void checkMoney(int[][] a, int b) {
		int i= 0, count = 0;
		System.out.println("有錢可借的員工編號:");
		for (int j =0; j < a[i].length; j++)
			if (a[i+1][j] > b) {
				System.out.print(a[i][j]+"\t");;
				count++;
			}
		System.out.println("共"+count+"人");
	}	
//////////////////////////////////////////////////////////////////	
	
		
/////////////////HW4_5-1 確認輸入數字是否合理///////////////////////////////		
	public void checkNum(int y, int m, int d) {
		HW4 lai = new HW4();
		boolean canM = true;
		if (y < 0 || m <= 0 || m > 12 )canM = false;
		if (canM)
			lai.countDay(y, m, d);
		else System.out.println("年或月份輸入錯誤，請重新輸入");
	}
	

	
/////////////////HW4_5-2 計算天數///////////////////////////////		
	public void countDay(int y, int m, int d) {
		int leapOrNot = 0, day = 0;
		int years[][]= {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		if ((y%4==0 && y%100!=0) || y%400==0) {
			leapOrNot = 1;
			for (int i = 0; i < m-1; i++)
				day += years[1][i];
		}
		else
			for (int j = 0; j < m-1; j++)
				day += years[0][j];
		
		
		if (d <= 0 || d > years[leapOrNot][m-1] )
			System.out.println("西元"+y+"年"+m+"月沒有"+d+"天，請重新輸入!!!");
		else {
		day+= d;
		System.out.println("西元"+y+"年\t第"+day+"天");
		}
	}
///////////////////////////////////////////////////////////////////////////	
	
	
	
	
/////////////////HW4_6 求學霸CARRY///////////////////////////////	
	
	public int[] grade(int[][] grade) {
		int count[] = new int[grade[0].length];
		for (int i= 0 ; i < grade.length; i++) {
			int max = 0, num = 0;
			for (int j = 0 ; j < grade[i].length; j++) {
				if (grade[i][j] > max) {
					max = grade[i][j];
					num = j;
				}
			}
			count[num] = count[num] +1;
		}
		return count;
	}
///////////////////////////////////////////////////////////////	
	
	
	
	
	
	
	
	
	

	
	
	
	

}

package xxx;

import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("我討厭:\n");
		int no = sc.nextInt();
		int count = 0;
		int [] array = new int[49];
		
		for (int i5 = 1; i5 <= 49; i5++) {
						if ((i5 / 10) != no && i5 % 10 != no) {
							count++;
							System.out.print(i5 + "\t");
							if(count % 6 ==0)
								System.out.println();
							
						}
															
		}
		
		
		
		System.out.println();
		System.out.println("共有"+count+"數字可選");
	}

}

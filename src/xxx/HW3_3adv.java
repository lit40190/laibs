package xxx;

import java.util.Scanner;

public class HW3_3adv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("我討厭:\n");
		int no = sc.nextInt();
		int i =0;
		int [] array = new int[49];
		
		for (int i5 = 1; i5 <= 49; i5++) {
			array[i5-1] = i5;
						if ((i5 / 10) == no || i5 % 10 == no) {
							array[i5-1] = 0;
						}													
		}

		while ( i < 6) {
			int num = (int)(Math.random()*49);
			if(array[num] != 0) {
				i++;
				System.out.print(array[num]+"\t");
				array[num] = 0;				
			}
		}
	}

}

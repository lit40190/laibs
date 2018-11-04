package xxx;

import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入要猜0~X的數字\n");
		System.out.println("X =");
		int i = (int)(Math.random()*100)+1;
		boolean guess = false;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int no = sc1.nextInt();
		System.out.println("開始猜數字吧!\n");
		while(!guess) {
			int num = sc.nextInt();
			if (num == i) {			
				guess = true;
				System.out.println("答對了!答案就是"+i);
			}else
				if(num < i)
					System.out.println("大一點好ㄇ\n");
				else
					System.out.println("小一點好ㄇ\n");
		}
	}

}

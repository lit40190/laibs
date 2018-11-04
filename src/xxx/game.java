package xxx;

import java.util.Scanner;

public class game {

	public int zero = 8;
	
	
	public static void main(String[] args) {
		game lai = new game();
		
		char[] answer = {'1','2','3','4','5','6','7','8','\u2450'};
		String code = String.valueOf(answer);
		
		for(int i = 0 ; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
			if((i+1)%3 ==0)
				System.out.println();
		}
		System.out.println("=====================================");
		
			while(true) {
				Scanner input = new Scanner(System.in);
				
				int nextStep = input.nextInt();
				if (nextStep == 1)break;
				if (nextStep == 2) {
				answer = lai.wash(answer);
				lai.printResult(answer);
				continue;
				}
				
				lai.exchange(answer, lai.move(nextStep));
				lai.printResult(answer);
				String result = String.copyValueOf(answer);
				if (code.equals(result)) {
					System.out.println(answer.toString()+"\t"+code);
					System.out.println("ok!");
					break;
				}
				
				
//				
				
			}
		System.exit(0);
		// TODO Auto-generated method stub

	}
	
	public void printResult(char[] answer) {
		for(int i = 0 ; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
			if((i+1)%3 ==0)
				System.out.println();
		}
		System.out.println("=====================================");
	}
	
	
	
	
	public char[] wash(char[] answer) {
		int[] a = {8,4,5,6};
		for(int i =0; i < 500; i++) {
		int k = (int)(Math.random()*4);
//		System.out.println(k);
		answer = exchange(answer, move(a[k]));
		}
		
		return answer;
	}
	
	
	
	public char[] exchange(char[] aa, int nextStep) {
		char temp;
		temp = aa[nextStep];
		aa[nextStep] = aa[this.zero];
		aa[this.zero] = temp;
		this.zero = nextStep;
//		System.out.println(this.zero);
		return aa;
	}
	
	
	
	public int move(int nextStep) {
		
		switch(nextStep) {
		
		case(5):
			if(this.zero + 3> 8 )
				return this.zero;
			else {
				return this.zero+3;
			}
		case(4):
			if(this.zero%3 == 0 ) {
				return this.zero;
				} 
			else { 
				return this.zero-1;
			}
			
		case(6):
			if((this.zero+1)%3 == 0 )
				return this.zero;
			else {
				return this.zero+1;
			}
		case(8):
			if(this.zero -3  < 0 )
				return this.zero;
			else {
				return this.zero-3;
			}	
		default:
		return this.zero;
		}
		
		
	}
	

}

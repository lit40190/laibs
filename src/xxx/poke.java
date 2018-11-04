package xxx;

public class poke {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int[] poke = new int[52];
		for(int i = 0; i < poke.length; i++) {
			poke[i] = i+1;
		}
		String[] suit = {"桃", "心", "磚", "梅"};
		String[] id = {"K","A","2","3","4","5","6","7","8","9","10","J","Q"};		
		int count = 0;
		int x;
		while(count < poke.length) {
			x = (int)(Math.random()*(52-count))+count;
			int kind = (int)(poke[x]-0.1)/13;
			int num = poke[x]%13;
			
			System.out.print(suit[kind]+id[num]+"\t");
			if ((count+1)%13 ==0)
				System.out.println();
						
			poke[x] = poke[count];
			count++;
		}
		
		System.out.println("Using Time:" + (System.currentTimeMillis() - startTime) + " ms");
		
		System.exit(0);
	}	
}

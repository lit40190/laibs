package xxx;

public class Ch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,8,7,9,6,3};
		int[] b = a;
		b[0]= 99;
		System.out.println(a[0]);

		String AA = "LOREN";
		String bb = AA;
		AA = "AAAA";
		System.out.println(AA==bb);
		
		
	}

}

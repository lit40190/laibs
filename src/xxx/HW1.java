package xxx;

public class HW1 {
	public static void main(String[] args) {
		
		
		
		int eggs = 200, sec = 256559, r = 5;
		int minute, hour, day, sec2;
		double rate = 1.02, base = 150;
		final int DOZEN = 12;
		final double PI = 3.1415; 
		day = sec/60/60/24;
		hour = sec/60/60%24;
		minute = sec/60%60;
		sec2 = sec%60;
		for (int i=1;i<=10;i++)
		{
			base *= rate;
		}
		System.out.println("1.  12 + 6 = "+(12+6));
		System.out.println("2.  200顆雞蛋為"+(eggs/DOZEN)+"打又"+(eggs%DOZEN)+"顆");
		System.out.println("3.  256559秒為"+day+"天"+hour+"小時"+minute+"分"+sec2+"秒");
		System.out.println("4.  半徑為5的圓面積為"+(PI*r*r)+"周長為"+(2*PI*r));
		System.out.println("5.  本金150萬利率2%,10年後本金加利息為"+base+"萬");
		System.out.println("6.  (1)"+(5+5));  //預設為整路相加5+5=10
		System.out.println("6.  (2)"+(5+'5'));//字元5查表unicode為0035(此為16進位),換算成10進位為53,固53+5=58
		System.out.println("6.  (3)"+(5+"5"));//此為自串串接,表示字串5後接上5,固為55

	}
	
	
	
	
	}
	
	


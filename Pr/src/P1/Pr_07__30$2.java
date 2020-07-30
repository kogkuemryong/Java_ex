package P1;

public class Pr_07__30$2 {
	public static void main(String[] args) {
	// [문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
	
	int money = 65430;
	int a, b, c, d;
	
	System.out.println("money = "+ money);	
	a = money/10000;
	money-=a*10000; // 계산값  money 값 누적 
	
	b = money/1000;
	money-=b*1000; // 계산값  money 값 누적 
	
	c = money/100;
	money -= c*100; // 계산값  money 값 누적 
	
	d = money/10;
	money -= d*10; // 계산값  money 값 누적 
	
	System.out.println("만원 = " + a);
	System.out.println("천원 = " + b);
	System.out.println("백원 = " + c);
	System.out.println("십원 = " + d);
	
			
	}

}

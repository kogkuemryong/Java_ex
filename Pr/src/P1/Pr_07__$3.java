package P1;

public class Pr_07__$3 {

	public static void main(String[] args) {
		//[문제3] 급여명세서를 작성하시오
		// 조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
		// 조건2) 실수령액 = 기본급 + 시간수당 - 세금
		
		int pay = 1500000;
		int timepay = 55000;
		double tax = 0.1;
		
		int resultPay = pay + timepay - (int)(pay*tax);
		System.out.println("실수령액 :" + resultPay);
		


	}

}

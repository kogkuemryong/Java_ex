package P2;

import java.util.Scanner;

/*[문제6] 다음을 입력받아 계산하시오
(삼각형넓이 = (밑변 * 높이)/2)  

--입력--
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3


--출력--
넓이 :   XX.XX  <--- 소수 2자리까지출력하시오
*/
public class P2_07_31_3$ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bottom , height;
		
		System.out.println("**** 삼각형의 넓이 구하기  ****");
		System.out.println("밑변 :"); bottom = scan.nextInt();
		System.out.println("높이 :"); height = scan.nextInt();
		
		double area = (double)(bottom * height) /2;
		System.out.printf("넓이 :%.2f" ,area);
		
		
		

	}

}

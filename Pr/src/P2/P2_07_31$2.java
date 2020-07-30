package P2;

import java.io.IOException;
import java.util.Scanner;

/*[문제5] 다음을 입력받아 계산하시오

--입력--
name : 민들래
kor : 90 
eng : 70 
mat : 75

--출력--
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오*/

public class P2_07_31$2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); 
		String name;
		int kor, eng, mat;
		
		System.out.println("이름 :"); name = scan.nextLine();
		System.out.println("kor :"); kor = scan.nextInt();
		System.out.println("eng :"); eng = scan.nextInt();
		System.out.println("mat :"); mat = scan.nextInt();
		
		
		int sum = kor + eng + mat;
		double mean = (double)sum/3;
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum);
		System.out.printf("평균점수 : %.1f",  mean);
		
		
		
		
		

	}

}

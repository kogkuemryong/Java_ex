package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제13]년도를 입력받아 윤년/평년 구하기
(공식)①,② 두조건을 다 만족해야 윤년임
  ①년도를 4로 나누어 떨어져야 함
 ②년도를 100으로나누어 떨어지지 않거나
   년도를 400으로 나누어 떨어져야 함
(참고) 4(윤년), 100(평년), 400(윤년)임 

--출력--
년도 입력 : 2000
윤년

년도 입력 : 2001
평년

년도 입력 : 2004
윤년*/

public class P4_08_02$3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		
		System.out.println("년도를 입력하세요 : "); year = Integer.parseInt(br.readLine());
		
		if(year%4==0 && (year/100!=0|| year/400==0)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		

	}

}

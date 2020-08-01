package P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제8] 값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
(if문과 ||연산자를 이용하시오)

점수입력 : 120
입력오류!!

점수입력 : 55
입력된값 : 55
*/

public class P3_08_01$2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.println("정수를 입력하세요 :"); num = Integer.parseInt(br.readLine());
		
		if(num > 0 || num <100) {
			System.out.println("입력오류!!");
		}else {
			System.out.println("입력된 값:" +num);
		}
				
		
		

	}

}

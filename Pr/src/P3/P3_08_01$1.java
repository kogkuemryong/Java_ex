package P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제7] BufferedReader를 이용하여 입력받아 두수중 큰수를 출력하시오
(단, 비교연산은 삼항연산자를 이용하시오)
Input a : 5
Input b : 13

큰수 : 13
*/
public class P3_08_01$1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		
		System.out.println("a를 입력하세요:");  a = Integer.parseInt(br.readLine());
		System.out.println("b를 입력하세요:");  b = Integer.parseInt(br.readLine());
		
		
		System.out.println("큰 수 :" + (a > b ? a : b)); 

	}

}

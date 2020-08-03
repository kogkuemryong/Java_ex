package P5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제17] for문을 이용하여 제곱승을 구하시오

x의 값을 입력하시오 : 3
y의 값을 입력하시오 : 3
3의 3승은 27
*/

public class P5_08_04_$3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		int result = 1;
		
		System.out.println("x의 값을 입력하시오 :"); x = Integer.parseInt(br.readLine());
		System.out.println("y의 값을 입력하시오 :"); y = Integer.parseInt(br.readLine());
		
		for(int i= 0; i<y ;i++) {
			result*=x;
		}
		System.out.println(x + "의" + y + "제곱근은" + result);
		
	}
	

}

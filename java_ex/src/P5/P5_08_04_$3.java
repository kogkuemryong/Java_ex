package P5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[����17] for���� �̿��Ͽ� �������� ���Ͻÿ�

x�� ���� �Է��Ͻÿ� : 3
y�� ���� �Է��Ͻÿ� : 3
3�� 3���� 27
*/

public class P5_08_04_$3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		int result = 1;
		
		System.out.println("x�� ���� �Է��Ͻÿ� :"); x = Integer.parseInt(br.readLine());
		System.out.println("y�� ���� �Է��Ͻÿ� :"); y = Integer.parseInt(br.readLine());
		
		for(int i= 0; i<y ;i++) {
			result*=x;
		}
		System.out.println(x + "��" + y + "��������" + result);
		
	}
	

}

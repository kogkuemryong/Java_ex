package P5;

/*[����16]1~100�����Ǽ� �߿���  3�� ����̸鼭 7�� ��� ���ϱ� 
����) for���� && �����ڸ� �ݵ�� �̿�

--���--
21 42 63 84   
*/

public class P5_08_04_$2 {

	public static void main(String[] args) {
		for(int i = 1; i <=100; i++) {
			if(i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}

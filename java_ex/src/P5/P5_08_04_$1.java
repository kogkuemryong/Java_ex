package P5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����15] 2�ڸ��� ������ �߻��Ͽ� �߻��� ���ڸ� ���ߴ� ���� ���α׷�
�����߻�) 1. int a=(int)(Math.random()*100) : 0 - 99 ������ ����
       2. �� import java.util.Random;
          �� Random ����1 = new Random();
          �� int ����2 = ����1.nextInt(�ִ밪); 
            ==>  0 ~ (�ִ밪 - 1)������ ������ ��

[������]
*** ������ �߻��Ͽ����ϴ�...���߾� ������...*** 

���� �Է� : 50
��ǻ���� ���ڰ� �� Ů�ϴ�..

���� �Է� : 90
��ǻ���� ���ڰ� �� �۽��ϴ�..

���� �Է� : 83
��ī��ī...xx������ ���߼̽��ϴ�...*/

public class P5_08_04_$1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a=(int)(Math.random()*100);
		int num , cnt = 0;
		
		
		while(true) {	
			System.out.println("���� �Է� : "); num = Integer.parseInt(br.readLine());
			cnt++;
			
			if(num > a)
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�.\n");
			else if(num<a)
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�.\n");
			else 
				break;
		
		}
		System.out.println("�����մϴ�" + cnt + "������ ���߼̽��ϴ�.");
	}

}

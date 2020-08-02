package P4;

import java.util.Random;

/*
[문제14] 50개의 난수를 만들어서 다음과 같이 출력하시오
조건1) 0 - 100 사이의 수 일것
조건2) 1줄에 6개씩 표시하시오  

--출력--
12      72      74      0       20      89
84      83      53      0       95      53
68      55      89      6       20      68
17      9       75      56      17      85
62      33      7       34      85      28
28      55      95      31      69      22
30      92      1       16      88      80
64      55      71      12      29      72
20      41
합=2420*/
public class P4_08_02$4 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		for (int i=1 ; i <=50 ; i++) {
			
			num = new Random().nextInt(101);
			System.out.println(num + "\t");
			sum += num;
			if(i % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n`합 = " + sum);
	}
}

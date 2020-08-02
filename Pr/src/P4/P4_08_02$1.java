package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제11]2개의 숫자와 연산자를 입력하여 계산하시오
조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
       "연산자error"출력하시오

[실행결과]
A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : +
25 + 36 = xx

A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : /
25 / 36 = xx.xxxxx      

A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : #
연산자 error*/


public class P4_08_02$1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a , b ;
		char op ;
		
		System.out.println("A값을 입력하시오 :");  a = Integer.parseInt(br.readLine());
		System.out.println("B값을 입력하시오 :");  b = Integer.parseInt(br.readLine());
		System.out.println("연산자를 입력(+,-,*,/) :"); op = br.readLine().charAt(0);
		
		switch(op)
		{
			case'+' : System.out.printf("%d %c %d = %d\n",a,op,b,a+b); break;
			case'-' : System.out.printf("%d %c %d = %d\n",a,op,b,a-b); break;
			case'*' : System.out.printf("%d %c %d = %d\n",a,op,b,a*b); break;
			case'/' : System.out.printf("%d %c %d = %d\n",a,op,b,a/b); break;
			default : System.out.println("연산자 error");

		}
		

		
		
		
		
		

	}

}

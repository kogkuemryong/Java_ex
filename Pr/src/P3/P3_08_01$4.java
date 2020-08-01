package P3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제10]
4개의 값을 콘솔에서 입력받아 처리하시오
조건) 성별 : M 이면 "남자", 나머지 "여자" 
     (삼항연산자 이용)

Input name: 장미란
Input gender: F
Input age:  25
Input tall: 173.3 

--결과--
이름 : 장미란
성별 : 여자 
나이 : 25세
신장 : 173.3cm  */

public class P3_08_01$4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.println("Input name:"); name = br.readLine();
		System.out.println("Input gender:"); gender = br.readLine().charAt(0);
		System.out.println("Input age:"); age = Integer.parseInt(br.readLine());
		System.out.println("Input tall:"); tall = Double.parseDouble(br.readLine());
		
		System.out.println("이름 :" + name);
		System.out.println("성별 :" + (gender =='M' ? "남자" :"여자"));
		System.out.println("나이 :" +age +"세");
		System.out.printf("신장 : %.1fcm",tall);
		
		
		
	
		
		
	}

}

package P4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*[문제12]성적처리프로그램

--입출력 화면--

   중간고사를 입력하시오 : 90
   기말고사를 입력하시오 : 89
   레포트고사를 입력하시오 : 99
   출석고사를 입력하시오 : 100

   중간고사 : 90
   기말고사 : 89
   레포트 : 99
   출석 : 100

   성적=93.20      <---소수이하 2째자리까지
   학점=A              System.out.printf("성적 : %.2f", avg);
   평가=excellent


   조건1) 
    (중간+기말)/2      ---> 60%
          레포트             ---> 20%
          출석               ---> 20%
     
   조건2)     
           90이상 'A'학점     (3)A,B학점  ---->"excellent"
           80이상 'B'학점        C,D학점  ---->"good"
           70이상 'C'학점        F학점    ---->"poor"
           60이상 'D'학점        (switch문이용) 
           나머지 'F'학점
           (if~else if문이용)
*/
public class P4_08_02$2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mid, last, report, attend;
		
		double score;
		char grade;
		String app = null;
		
		System.out.println("중간고사를 입력하시오 :"); mid = Integer.parseInt(br.readLine());
		System.out.println("기말고사를 입력하시오 :"); last = Integer.parseInt(br.readLine());
		System.out.println("레포트고사를 입력하시오 :"); report = Integer.parseInt(br.readLine());
		System.out.println("출석고사를 입력하시오 :"); attend = Integer.parseInt(br.readLine());
		
		
		System.out.println("중간고사 : "+mid);
		System.out.println("기말고사 : "+last);
		System.out.println("레포트 : "+report);
		System.out.println("출석 : "+attend);
		
		score = (double)(mid +last)/2 *0.6 + report *0.2 +attend * 0.2;
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';

		else
			grade = 'F';
		
		
		switch (grade)
		{
			case'A':
			case'B': app ="excellent"; break;
			case'C':
			case'D': app ="good"; break;
			case'F': app = "poor"; break;

		
		}
		
		System.out.printf("성적 : %.2f\n",score);
		System.out.println("학점 : "+grade);
		System.out.println("평가 : "+app);
		

		
		
	}

}

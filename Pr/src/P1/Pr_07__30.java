package P1;

public class Pr_07__30 {

	public static void main(String[] args) {
		
	// a 와  b의 값을 형변환해서 두수의 곱을 구하시오
		
    String a ="100";
    String b = "200";
    
    // String -> int : Integer.parseInt();
    int num_a = Integer.parseInt(a);
    int num_b = Integer.parseInt(b);
    
	System.out.println(num_a + " * " + num_b + " = " + (num_a*num_b));
	
	
	
	
	}

}

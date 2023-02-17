package homework3_2;

public class Formula {

	public static void main(String[] args) {
		
		// 다음의 수식의 결과를 출력하시오. 1-2+3-4+5...-10=? 반드시 '1-2+3-4+5-6+7-8+9-10=?'로 출력할것

		String s = "";
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum -= i;
				s += "-" + i; 
			} else {
				sum += i;
				s += "+" + i; 
			}
		}
		s += "=" + sum;
		
		for (int i = 1; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
	}

}

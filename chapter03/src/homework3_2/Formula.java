package homework3_2;

public class Formula {

	public static void main(String[] args) {
		
		// ������ ������ ����� ����Ͻÿ�. 1-2+3-4+5...-10=? �ݵ�� '1-2+3-4+5-6+7-8+9-10=?'�� ����Ұ�

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

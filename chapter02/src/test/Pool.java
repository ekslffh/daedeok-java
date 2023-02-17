package test;

public class Pool {

	public static void main(String[] args) {

//		String str = "100";
//		int a = Integer.parseInt(str);
//		
//		
//		System.out.println(str + 3);
		
		String a = "hello	world";
		String b = "hello\t world";
		System.out.println(a);
		System.out.println(b);
		System.out.println((int)'a');
		
		int i = 4000;
		byte bt = (byte)i;
		System.out.println(bt);
		
		char charValue = 'A';
		short shortValue = (short) charValue;
		
		String strValue = "A";

		char c1 = 'a';
		char c2 = (char) ((char)c1 + 1);
		
		System.out.printf("%d *** %d", 1,2);
		
	}

}

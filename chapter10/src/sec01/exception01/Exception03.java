package sec01.exception01;

import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		
		try {
			int ch = System.in.read();
			
			System.out.println((char) ch);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

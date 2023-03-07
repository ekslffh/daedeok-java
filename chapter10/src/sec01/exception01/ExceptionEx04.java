package sec01.exception01;

import java.io.IOException;

public class ExceptionEx04 {

	public static void main(String[] args) {
		try {
			char res = inputData(); 
		} catch (IOException e) {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static char inputData() throws IOException, Exception {
		int ch = System.in.read();
		return (char) ch;
	}

}

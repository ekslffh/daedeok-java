package sec02.exam01;

import java.io.IOException;

public class ExamInput {

	public static void main(String[] args) {

		// System.in.read() : ���� �Ѱ� �Է�
		// . ����(int)�� ����
		// . ����ó���ȿ��� ���
		int ch = 0;
		try {
			ch = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("ch = " + ch);
		System.out.println("ch = " + (char)ch);

	}

}
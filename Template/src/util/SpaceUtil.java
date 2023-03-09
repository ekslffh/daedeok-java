package util;

public class SpaceUtil {
	public static void main(String[] args) {
		System.out.print("'");
		System.out.print(SpaceUtil.format("안녕하세요", 31, -1));
		System.out.print("'");
		System.out.println();
		System.out.print("'");
		System.out.print(SpaceUtil.format("안녕하세요", 31, 0));
		System.out.print("'");
		System.out.println();
		System.out.print("'");
		System.out.print(SpaceUtil.format("안녕하세요", 31, 1));
		System.out.print("'");
		System.out.println();
		System.out.print("'");
		System.out.print(SpaceUtil.format("Hello", 30, -1));
		System.out.print("'");
		System.out.println();
		System.out.print("'");
		System.out.printf("%-30s", "안녕하세요");
		System.out.print("'");
		System.out.println();
		System.out.print("'");
		System.out.printf("%-30s", "Hello");
		System.out.print("'");
	}

	/**
	 * 한글이 포함된 문자열을 길이에 맞게 정렬하고 싶을때 이용한다.
	 * 
	 * @param obj    : 문자열 혹은 문자, 숫자 등을 자유롭게 입력할 수 있다.
	 * @param length : 제작하려는 문자열의 총 길이를 입력한다.
	 * @param sort   : 음수는 좌측정렬 || 양수는 우측정렬 || 0은 중앙정렬이다.
	 * @return 길이에 맞는 띄어쓰기가 포함된 문자열이 반환된다.
	 */
	public static String format(Object obj, int length, int sort) {
		int spaceCount = length;
		String sO = obj.toString();
		String result = "";
		for (int i = 0; i < sO.length(); i++) {
			if (sO.charAt(i) >= 'ㄱ' && sO.charAt(i) <= '힣') {
				spaceCount -= 2;
			} else {
				spaceCount--;
			}
		}
		if (sort < 0) {
			result += sO;
			for (int i = 0; i < spaceCount; i++) {
				result += " ";
			}
		} else if (sort > 0) {
			for (int i = 0; i < spaceCount; i++) {
				result += " ";
			}
			result += sO;
		} else {
			for (int i = 0; i < spaceCount / 2; i++) {
				result += " ";
			}
			result += sO;
			for (int i = spaceCount / 2; i < spaceCount; i++) {
				result += " ";
			}
		}
		return result;
	}
}

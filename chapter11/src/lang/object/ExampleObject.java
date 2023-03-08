package lang.object;

public class ExampleObject {
	
	public static void main(String[] args) {
		/**
		 * 자바의 조상 클래스
		 * 11개의 메서드로 구성(clone(), equals(), finalize(), getClass(),
		 * hashCode(), notify(), notifyAll(), toString(), wait(),
		 * wait(), wait()
		 * 1) clone() - 객체를 복사하여 객체반환
		 * 2) equals() - 객체와 객체를 비교한 결과를 반환 (true, false)
		 * 3) finalize() - 객체사용이 종료되었을 때 기억장소 정리를 위해 호출
		 * 4) getClass() - 현재 객체정보를 Class 타입으로 반환
		 * 5) hashCode() - 객체의 저장주소(해쉬함수결과) 반환
		 * 6) notify(), notifyAll() - 대기 중인 스레드를 활성화 시킴
		 * 7) wait() - 실행중인 상태의 스레드를 대기 상태로 전환
		 * 8) toString() - 객체 정보를 문자열로 반환
		 */
		// toString() - 객체 정보를 문자열로 반환
		// return 클래스이름 + "@" + 객체주소
		// return getClass().getName() + '@' + Integer.toHexString(hashCode())

		// equals() - 매개변수로 전달받은 객체와 자신을 비교하여 참 또는 
		// 			  거짓을 반환
		Person p1 = new Person("690115-1388763", "PARK");
		Person p2 = new Person("690115-1388763", "park");
		Person p3 = p1; // 얕은 복사
		
//		System.out.println(p1);
//		System.out.println(p2.equals(p1));
//		System.out.println(p1.equals(p3));
		
		Person p4 = p1.clone();
		System.out.println(p1 == p3);
		System.out.println(p1 == p4);
		System.out.println(p1.equals(p4));
		System.out.println(p4);
		
	}
	
}

class Person implements Cloneable {
	private String id;
	private String name;
	
	Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = null;
		if (obj instanceof Person) {
			p = (Person) obj;
		}
		
		if (p != null && this.id.equals(p.id)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public Person clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Person) obj;
	}
	
}

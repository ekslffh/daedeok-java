package dto;

// 데이터 구조정의 => db의 테이블의 컬럼명을 사용하여 setter/getter method로 구성
// db 내용을 계층간 전달하는데 사용
// dto : data transfer object
// vo : value object
public class LibMemberDTO {
	
	private int mem_num;
	private String mem_id;
	private String mem_name;
	
	public LibMemberDTO() {}
	
	public LibMemberDTO(int mem_num, String mem_id, String mem_name) {
		this.mem_num = mem_num;
		this.mem_id = mem_id;
		this.mem_name = mem_name;
	}

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
	@Override
	public String toString() {
		return mem_num + ", " + mem_id + ", " + mem_name; 
	}
	
}

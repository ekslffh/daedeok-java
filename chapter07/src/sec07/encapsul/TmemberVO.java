package sec07.encapsul;

public class TmemberVO {
	
	private String mem_id;
	private String mem_name;
	private String mem_pass;

	TmemberVO() {}
	
	TmemberVO(String mem_id, String mem_name, String mem_pass) {
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_pass = mem_pass;
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

	public String getMem_pass() {
		return mem_pass;
	}

	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	
	@Override
	public String toString() {
		return mem_id + ", " + mem_name + ", " + mem_pass;
	}

}

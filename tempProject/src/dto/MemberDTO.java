package dto;

//M_ID, M_PW, M_NAME, M_TELNO, M_ADD
public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String address;
	private int mileage;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "id: " + id.trim() + ", pw: " + pw + ", name: " + name + ", tel: " + tel + ", address: " + address + ", mileage: " + mileage;
	}
	
}

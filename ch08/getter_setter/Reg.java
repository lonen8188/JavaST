package ch08.getter_setter;

import java.util.Date;

public class Reg { //회원등록용 객체
	private String name ; 
	private String id ;
	private String pw ;
	private String email ;
	private String add ;
	private int age ; 
	private Date brithday ;
	private boolean marry ;
	
	public Reg() {}; //기본생성자
	public Reg(String name, String id, String pw, String email, String add) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.add = add;
	} // 사용자 지정 생성자
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}
	public String getAdd() {
		return add;
	}
	public int getAge() {
		return age;
	}
	public Date getBrithday() {
		return brithday;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	
	

	
	
}

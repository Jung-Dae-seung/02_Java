package project_정대승.kh.model.dto;

import java.io.Serializable;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;		// 회원id
	private String pw;		// 회원password
	private String name;	// 회원이름
	private String type;	// 회원타입(관리자/유저)
	
	public Member() {}

	public Member(String id, String pw, String name, String type) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.type = type;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "회원 [아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 유형 : " + type + "]";
	}
	
	public String getList() {
		return "회원 [아이디 : " + id + ", 이름 : " + name + ", 유형 : " + type + "]";
	}
	
	
	
	
}

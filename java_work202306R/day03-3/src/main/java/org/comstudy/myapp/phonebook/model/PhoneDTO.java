package org.comstudy.myapp.phonebook.model;

import java.util.Objects;

public class PhoneDTO {
	private int no;
	private String name;
	private String phone;
	
	public PhoneDTO() {
		this(0, "", ""); // 오버로딩 된 생성자 호출
	}
	// 생성자 오버로딩
	public PhoneDTO(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "PhoneDTO [no=" + no + ", name=" + name + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneDTO other = (PhoneDTO) obj;
		return no == other.no;
	}
}

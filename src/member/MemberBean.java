package member;

public class MemberBean {
	private String id,pw,name,gender,email,birth,phone,address,
	intro,sns,profileImg,msgLogout,msgUpdate;

	
	public String getMsgLogout() {
		return msgLogout;
	}

	public void setMsgLogout(String msgLogout) {
		this.msgLogout = msgLogout;
	}

	public String getMsgUpdate() {
		return msgUpdate;
	}

	public void setMsgUpdate(String msgUpdate) {
		this.msgUpdate = msgUpdate;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getSns() {
		return sns;
	}

	public void setSns(String sns) {
		this.sns = sns;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", birth=" + birth + ", phone=" + phone + ", address=" + address + ", intro=" + intro + ", sns=" + sns
				+ ", profileImg=" + profileImg + "]";
	}
	
	
}



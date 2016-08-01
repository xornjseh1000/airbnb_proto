package member;

public class MemberBean {

	private String id, pw, name, gender, email, birth, phone, address, intro, sns, profileImg;

	public MemberBean(String id, String pw, String name, String ssn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
		this.intro = intro;
		this.sns = sns;
		this.profileImg = profileImg;
	}


	public MemberBean() {
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
		return "회원 [아이디=" + id + ", 비밀번호= ****, 이름=" + name + ", 성별=" + gender + ", 이메일=" + email + ", 생일=" + birth
				+ ", 연락처=" + phone + ", 주소=" + address + ", 자기소개=" + intro + ", 생년월일=" + sns + ", 프로필이미지=" + profileImg
				+ "]";
	}
}
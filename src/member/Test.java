package member;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		MemberService service = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog("1회원가입 2로그인")) {
			case "1":
				MemberBean m = new MemberBean();
				String input = JOptionPane.showInputDialog("ID,PW,NAME,GENDER,EMAIL,BIRTH,PHONE,ADDRESS,INTRO,SNS,PROFILEIMG");
				String[]inputArr = input.split(",");
				m.setId(inputArr[0]);
				m.setPw(inputArr[1]);
				m.setName(inputArr[2]);
				m.setGender(inputArr[3]);
				m.setEmail(inputArr[4]);
				m.setBirth(inputArr[5]);
				m.setPhone(inputArr[6]);
				m.setAddress(inputArr[7]);
				m.setIntro(inputArr[8]);
				m.setSns(inputArr[9]);
				m.setProfileImg(inputArr[10]);
				service.regist(m);
				
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
package member;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog("1회원가입 2로그인 3수정 4탈퇴")) {
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
			case "2":
				MemberBean loginCon = new MemberBean();
				String input2 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr2 = input2.split(",");
				loginCon.setId(inputArr2[0]);
				loginCon.setPw(inputArr2[1]);
				String result4 = service.login(loginCon);
				JOptionPane.showMessageDialog(null, result4);
				break;
			case "3":
				MemberBean updateCon= new MemberBean();
				String input3 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr3 = input3.split(",");
				updateCon.setId(inputArr3[0]);
				updateCon.setPw(inputArr3[1]);
				service.update(updateCon);
				break;
			case "4":
				MemberBean deleteCon = new MemberBean();
				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr4 = input4.split(",");
				deleteCon.setId(inputArr4[0]);
				deleteCon.setPw(inputArr4[1]);
				service.delete(deleteCon);
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
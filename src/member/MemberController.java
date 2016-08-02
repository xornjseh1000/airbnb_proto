package member;

import javax.swing.JOptionPane;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = MemberServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog("1회원가입 2로그인 3수정 4탈퇴 5로그아웃 0종료")) {
			case "1": // 가입 완료
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
			case "2": // 로그인 완료
				MemberBean loginCon = new MemberBean();
				String input2 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr2 = input2.split(",");
				loginCon.setId(inputArr2[0]);
				loginCon.setPw(inputArr2[1]);
				String result = service.login(loginCon);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "3": // 수정 미완
				MemberBean bean = new MemberBean();
				 String input3=JOptionPane.showInputDialog("변경할 pw=?, email=?, phone=?, address=?, intro=?");
				 String[] inputArr3 = input3.split(",");
				 bean.setPw(inputArr3[0]);
				 bean.setEmail(inputArr3[1]);
				 bean.setPhone(inputArr3[2]);
				 bean.setAddress(inputArr3[3]);
				 bean.setIntro(inputArr3[4]);
				 service.update(bean);
				break;
			case "4": // 삭제 (완료)
				MemberBean deleteCon = new MemberBean();
				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr4 = input4.split(",");
				deleteCon.setId(inputArr4[0]);
				deleteCon.setPw(inputArr4[1]);
				service.delete(deleteCon);
				break;
			case "5" : // 로그아웃 (완료)
				MemberBean logOutCon = new MemberBean();
				String input5 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr5 = input5.split(",");
				logOutCon.setId(inputArr5[0]);
				logOutCon.setPw(inputArr5[1]);
				service.logOut(logOutCon);
				JOptionPane.showMessageDialog(null, "로그아웃 합니다");
				break;
			case "0":
				return;
			default:
				break;
			}
		}
	}
}
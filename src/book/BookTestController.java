package book;

import javax.swing.JOptionPane;

import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

public class BookTestController {
	public static void main(String[] args) {
		BookServiceImpl bService = BookServiceImpl.getInstance();
		BookBean bBean = new BookBean();

		while (true) {
			switch (JOptionPane.showInputDialog("1.숙소검색\n 2.예약\n 3.예약취소 4.예약정보 변경 5로그인")) {
			case "1":
				break;

			case "2": // 예약(완료)

				String input2 = JOptionPane.showInputDialog("checkIn, checkOut, count");
				String[] inputArr2 = input2.split(",");
				bBean.setCheckIn(inputArr2[0]);
				bBean.setCheckOut(inputArr2[1]);
				bBean.setCount(Integer.parseInt(inputArr2[2]));
				bService.book(bBean);
				break;

			case "3": // 취소
				MemberBean mBean = new MemberBean();
				BookServiceImpl service = BookServiceImpl.getInstance();

				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[] inputArr4 = input4.split(",");
				mBean.setId(inputArr4[0]);
				service.cancel(bBean);
				break;

			case "5": // 로그인 완료
				MemberBean loginCon = new MemberBean();
				MemberService mService = MemberServiceImpl.getInstance();
				String input5 = JOptionPane.showInputDialog("ID,PW");
				String[] inputArr5 = input5.split(",");
				loginCon.setId(inputArr5[0]);
				loginCon.setPw(inputArr5[1]);
				String result = mService.login(loginCon);
				JOptionPane.showMessageDialog(null, result);
				break;

			case "0":
				return;
			default:
				break;
			}
		}
	}

}
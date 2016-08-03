package book;

import javax.swing.JOptionPane;

import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

public class BookTestController {
	public static void main(String[] args) {
		BookServiceImpl bService = BookServiceImpl.getInstance();
		BookBean bBean = new BookBean();
		BookCityBean bcBean = new BookCityBean();

		while (true) {
			switch (JOptionPane.showInputDialog("1.숙소검색\n 2.예약\n 3.예약취소 4.예약정보 변경 5로그인")) {
			case "1": // 리스트 미완
				JOptionPane.showMessageDialog(null, bService.search(bcBean));
				break;

			case "2": // 예약(주소)

				String input2 = JOptionPane.showInputDialog("checkIn, checkOut, count");
				String[] inputArr2 = input2.split(",");
				bBean.setCheckIn(inputArr2[0]);
				bBean.setCheckOut(inputArr2[1]);
				bBean.setCount(Integer.parseInt(inputArr2[2]));
				bService.book(bBean);
				break;

			case "3": // 취소 (id로만 삭제)
				MemberBean mBean = new MemberBean();
				BookServiceImpl service = BookServiceImpl.getInstance();

				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[] inputArr4 = input4.split(",");
				mBean.setId(inputArr4[0]);
				service.cancel(bBean);
				break;
				
			case "4": // 예약정보 변경 (수정) 완료
				BookBean bookUp = new BookBean();
				String update = JOptionPane.showInputDialog("수정할 체크인, 체크아웃, 인원수");
				String[] update2 = update.split(",");
				bookUp.setCheckIn(update2[0]);
				bookUp.setCheckOut(update2[1]);
				bookUp.setCount(Integer.parseInt(update2[2]));
				JOptionPane.showMessageDialog(null, bService.reigst(bookUp));
				break;

			case "5": // 로그인 완료 // 세션때문에 임시 컨트롤러에서 가져온 것!
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
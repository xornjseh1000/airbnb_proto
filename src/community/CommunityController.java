package community;

import javax.swing.JOptionPane;

public class CommunityController {
public static void main(String[] args) {
	CommunityService service = CommunityServiceImpl.getInstance();
	CommunityBean bean = new CommunityBean();
	while (true) {
		switch (JOptionPane.showInputDialog("1.심볼 등록,2.심볼 수정,3심볼 삭제")) {
		case "1":
			String foo = JOptionPane.showInputDialog("원하시는 심볼,당신의 이야기를 들려주세요.");
			String[] fooArr = foo.split(",");
			bean.setSymbol(fooArr[0]);
			bean.setStory(fooArr[1]);
			service.regist(bean);
			break;
		case "2":
			String ba = JOptionPane.showInputDialog("수정할 심볼,변화된 일상을 입력해주세요.");
			String[] baArr = ba.split(",");
			bean.setSymbol(baArr[0]);
			bean.setStory(baArr[1]);
			service.update(bean);
			break;
		case "3":
			String temp = JOptionPane.showInputDialog("삭제할 심볼의 번호를 입력하세요");
			bean.setSymbol(temp);
			service.delete(bean);
			break;

		default:
			break;
		}
	}
}
}

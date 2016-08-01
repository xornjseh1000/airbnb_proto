package guide;

import javax.swing.JOptionPane;

public class GuideController {
	public static void main(String[] args) {
	GuideBookServiceImpl service = GuideBookServiceImpl.getInstance();
	while (true) {
		switch (JOptionPane.showInputDialog("1.검색하기")) {
		case "1":break;

		default:
			break;
		}
	}
}
}

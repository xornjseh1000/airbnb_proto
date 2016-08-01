package host;

import javax.swing.JOptionPane;

public class CityController {
	public static void main(String[] args) {
		CityService service = CityServiceImpl.getInstance();
		CityBean bean = new CityBean();
	while (true) {
		switch (JOptionPane.showInputDialog("1.등록 2.수정 3.삭제 4.위치 5.리뷰")) {
		case "1":
			String foo = JOptionPane.showInputDialog("주소,설명,리뷰,가격,옵션,상세주소,시설여부,환불정책,집 유형,언어,사진,방갯수,화장실갯수,침대갯수,ID 입력");
			String[] fooArr = foo.split(",");
			bean.setAddress(fooArr[0]);
			bean.setExplain(fooArr[1]);
			bean.setReview(fooArr[2]);
			bean.setPrice(fooArr[3]);
			bean.setOption(fooArr[4]);
			bean.setLocal(fooArr[5]);
			bean.setFacilities(fooArr[6]);
			bean.setPolicy(fooArr[7]);
			bean.setHouseType(fooArr[8]);
			bean.setLanguage(fooArr[9]);
			bean.setPhoto(fooArr[10]);
			bean.setRoom(Integer.parseInt(fooArr[11]));
			bean.setToilet(Integer.parseInt(fooArr[12]));
			bean.setBed(Integer.parseInt(fooArr[13]));
			bean.setId(fooArr[14]);
			service.regist(bean);
			break;
		case "2":
			String ba = JOptionPane.showInputDialog("수정할 주소,설명,리뷰,가격,옵션,상세주소,시설여부,환불정책,집 유형,언어,사진,방갯수,화장실갯수,침대갯수,ID 입력");
			String[] baArr = ba.split(",");
			bean.setAddress(baArr[0]);
			bean.setExplain(baArr[1]);
			bean.setReview(baArr[2]);
			bean.setPrice(baArr[3]);
			bean.setOption(baArr[4]);
			bean.setLocal(baArr[5]);
			bean.setFacilities(baArr[6]);
			bean.setPolicy(baArr[7]);
			bean.setHouseType(baArr[8]);
			bean.setLanguage(baArr[9]);
			bean.setPhoto(baArr[10]);
			bean.setRoom(Integer.parseInt(baArr[11]));
			bean.setToilet(Integer.parseInt(baArr[12]));
			bean.setBed(Integer.parseInt(baArr[13]));
			bean.setId(baArr[14]);
			service.update(bean);
			JOptionPane.showMessageDialog(null, "수정완료");
			break;
		case "3":
			JOptionPane.showInputDialog("삭제?");
			service.delete(bean);
			break;
		case "4":break;
		case "5":
			
			break;

		default:
			break;
		}
	}
	}
}

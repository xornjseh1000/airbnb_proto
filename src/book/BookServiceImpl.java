package book;

import java.util.List;

import host.CityService;
import host.CityServiceImpl;

public class BookServiceImpl {
	BookDAO dao = BookDAO.getInstance();
	BookCityBean bcSession;
	BookBean bBean = new BookBean();
	CityService cService = CityServiceImpl.getInstance();
	
	public BookCityBean getbcSession() {
		return bcSession;
	}

	private static BookServiceImpl instance = new BookServiceImpl();

	public static BookServiceImpl getInstance() {
		return instance;
	}

	public void book(BookBean bBean) {
		dao.book(bBean);
	}

	public void cancel(BookBean bBean) {
		dao.cancel(bBean);
	}

	public String reigst(BookBean mBean) {
		String update = "";
		if (dao.reigst(mBean) == 1) {
			update = "성공";
		} else {
			update = "실패";
		}
		return update;
	}

	public List<BookCityBean> search(BookCityBean bean) {
		return dao.search();
	}

}
package book;

public class BookServiceImpl {
	BookDAO dao = BookDAO.getInstance();
	BookCityBean bcSession;
	BookBean bBean = new BookBean();

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

/*	public void search(BookCityBean bean) {
		return dao.search();
	}*/
}
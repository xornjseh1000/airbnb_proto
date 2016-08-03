package book;

import java.util.List;

public class BookServiceImpl implements BookService{
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
	@Override
	public void regist(BookCityBean mBean) {
		dao.regist(mBean);
	}

	@Override
	public void wishlist(BookCityBean bean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void wishlistDel(BookCityBean bean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BookCityBean search(BookCityBean bean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<?> list(String id) {
		return dao.list(id);
	}
	@Override
	public void delete(String address) {
		dao.delete(address);
		
	}
	
}
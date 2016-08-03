package book;

import java.util.List;

public interface BookService {
	public void book(BookBean bean);
	public void cancel (BookBean bean);
	public void regist (BookCityBean bean);
	public void wishlist (BookCityBean bean);
	public void wishlistDel (BookCityBean bean);
	public BookCityBean search(BookCityBean bean);
	public List<?> list(String id);
}

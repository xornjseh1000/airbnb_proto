package book;

public interface BookService {
	public BookBean book(BookBean bean);
	public BookBean cancel (BookBean bean);
	public BookBean regist (BookBean bean);
	public void wishlist (BookCityBean bean);
	public void wishlistDel (BookCityBean bean);
	public BookCityBean search(BookCityBean bean);
}

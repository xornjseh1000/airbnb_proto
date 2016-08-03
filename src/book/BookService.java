package book;

import java.util.List;

public interface BookService {
	public void book(BookBean bean);
	public void cancel (BookBean bean);
	public void regist (BookCityBean bean);
	public void delete(String address);
	public List<?> list(String id);
	public List<?> search(String address);
}

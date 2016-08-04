package book;

import java.util.List;

public interface BookService {
	public void regist (BookCityBean bean);
	public void delete(String address);
	public List<?> list(String id);
	public BookCityBean check(String address);
	public List<?> search(String address);
}

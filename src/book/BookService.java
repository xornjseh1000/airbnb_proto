package book;
import java.util.List;

public interface BookService {
	
	public void book(BookBean bBean);
	public BookBean cancel (BookBean bBean);
	public List<BookCityBean> search(BookCityBean bean);
	public String reigst(BookBean bBean);
	/*public List<?> list(); 
	public List<?> findBy(String keyword);
	/*public BookCityBean search(BookCityBean bean);*/
}
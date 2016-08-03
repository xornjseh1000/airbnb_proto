package book;
public interface BookService {
	
	public void book(BookBean bBean);
	public BookBean cancel (BookBean bBean);
	public BookCityBean search(BookCityBean bean);
	public String reigst(BookBean bBean);

}
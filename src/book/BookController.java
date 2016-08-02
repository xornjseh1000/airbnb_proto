package book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.DispatcherServlet;
import global.Separator;

@WebServlet("/book.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		switch (Separator.command.getAction()) {
		case "book":			
			break;
		case "cancel":
			break;
		case "update":
			break;
		case "wishlist":
			break;
		case "wishlist_del":
			break;
		case "search":
			break;

		}
		DispatcherServlet.send(request, response, Separator.command);
	}


}

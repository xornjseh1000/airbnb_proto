package book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Separator;
import host.CityService;
import host.CityServiceImpl;
import member.MemberBean;

@WebServlet("/book.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Separator.init(request, response);
		CityService cityservice = CityServiceImpl.getInstance();
		BookService bookservice = BookServiceImpl.getInstance();
		BookCityBean bean = new BookCityBean();
		MemberBean member = (MemberBean) request.getSession().getAttribute("user");
		switch (Separator.command.getAction()) {
		case "booklist":
			System.out.println("test..");
			if (member == null) {
				Separator.command.setDirectory("global");
				Separator.command.setPage("logout");
				Separator.command.setView();
			}else{
				Separator.command.setPage("booklist");
				request.setAttribute("list", cityservice.list());
				Separator.command.setView();
			}
			break;
		case "find_by":
			Separator.command.setDirectory("member");
			Separator.command.setView();
			request.setAttribute("city", cityservice.detail(request.getParameter("keyword")));
			break;
		case "find_by_list":
			request.setAttribute("city", cityservice.detail(request.getParameter("keyword")));
			break;
		case "booking":
			if (session.getAttribute("id").equals((String)request.getParameter("id"))) {
				request.setAttribute("list", cityservice.list());
				Separator.command.setPage("fail2");
				Separator.command.setView();
			}else{
				if (bookservice.check(request.getParameter("address")) != null) {
					request.setAttribute("list", cityservice.list());
					Separator.command.setPage("fail");
					Separator.command.setView();
				}else{
					bean.setId(member.getId());
					bean.setAddress(request.getParameter("address"));
					bean.setHouseType(request.getParameter("house_type"));
					bean.setRoom(Integer.parseInt(request.getParameter("room")));				
					bean.setToilet(Integer.parseInt(request.getParameter("toilet")));
					bean.setBed(Integer.parseInt(request.getParameter("bed")));
					bean.setCount(Integer.parseInt(request.getParameter("count")));
					bean.setFacilities(request.getParameter("facilities"));
					bean.setCheckIn(request.getParameter("check_in"));
					bean.setCheckOut(request.getParameter("check_out"));
					bean.setExplain(request.getParameter("explain"));
					bookservice.regist(bean);
					Separator.command.setPage("index");
					Separator.command.setView();
					DispatcherServlet.send2(request, response, Separator.command);
					return;
				}
			}
			break;
		case "delete":
			bookservice.delete(request.getParameter("address"));
			Separator.command.setPage("index");
			Separator.command.setView();
			DispatcherServlet.send2(request, response, Separator.command);
			return;
		case "search":
			if (member == null) {
				Separator.command.setDirectory("global");
				Separator.command.setPage("logout");
				Separator.command.setView();
			}else{
				if (request.getParameter("search") == "") {
					Separator.command.setPage("index");
					Separator.command.setView();
					DispatcherServlet.send2(request, response, Separator.command);
					return;
				}else{
					System.out.println("실패");
					String temp2 = request.getParameter("search");
					String[] address2 = temp2.split(",");
					request.setAttribute("list", bookservice.search(address2[0]));
					Separator.command.setPage("booklist");
					Separator.command.setView();
				}
			}
			break;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}


}

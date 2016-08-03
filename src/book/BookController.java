package book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.DispatcherServlet;
import global.Separator;
import host.CityService;
import host.CityServiceImpl;
import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

@WebServlet("/book.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		CityService cityservice = CityServiceImpl.getInstance();
		BookService bookservice = BookServiceImpl.getInstance();
		MemberService memberservice = MemberServiceImpl.getInstance();
		BookCityBean bean = new BookCityBean();
		switch (Separator.command.getAction()) {

		case "booklist":
			System.out.println("들어옴??????");
			request.setAttribute("list", cityservice.list());
			System.out.println("리스트 목록 "+cityservice.list());
			break;
		case "find_by":
			System.out.println("find_by 들어옴??????");
			request.setAttribute("city", cityservice.detail(request.getParameter("keyword")));
			System.out.println("address주소 : "+ request.getParameter("keyword"));
			System.out.println("find_by 목록 : "+ cityservice.detail(request.getParameter("keyword")));
			break;
		case "booking":
			MemberBean member = (MemberBean) request.getSession().getAttribute("user");
			
			System.out.println("booking Bean : "+bean);
			
			if (member!=null) {
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
				System.out.println("예약함!!!!!!!!");
				Separator.command.setPage("index");
				Separator.command.setView();
				DispatcherServlet.send2(request, response, Separator.command);
				return;
			}else{
				System.out.println("null값 들어옴????");
				Separator.command.setPage("book");
				Separator.command.setView();
			}
			break;
		case "delete":
			bookservice.delete(request.getParameter("address"));
			Separator.command.setDirectory("member");
			Separator.command.setPage("mypage");
			Separator.command.setView();
			break;
		case "search":
			String temp = request.getParameter("search");
			String[] address = temp.split(",");
			request.setAttribute("list", bookservice.search(address[0]));
			System.out.println("주소확인 : "+address[0]);
			break;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}


}

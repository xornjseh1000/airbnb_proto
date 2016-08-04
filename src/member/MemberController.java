package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import book.BookService;
import book.BookServiceImpl;
import global.DispatcherServlet;
import global.Separator;
import host.CityService;
import host.CityServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		HttpSession session = request.getSession();
		MemberService service = MemberServiceImpl.getInstance();
		BookService bookservice = BookServiceImpl.getInstance();
		CityService hostservice = CityServiceImpl.getInstance();
		MemberBean bean = new MemberBean();
		MemberBean temp = new MemberBean();
		switch (Separator.command.getAction()) {
		case "regist":
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			bean.setName(request.getParameter("name"));
			bean.setEmail(request.getParameter("email"));
			bean.setBirth(request.getParameter("year")+","+request.getParameter("month")+","+request.getParameter("day"));
			if (service.regist(bean) == "") {
				Separator.command.setPage("regist");
				Separator.command.setView();
			}else{
				Separator.command.setPage("login");
				Separator.command.setView();
			}
			break;
		case "login":
			bean.setId(request.getParameter("id"));
			bean.setPw(request.getParameter("pw"));
			temp = service.login(bean);
			if (bean.getId().equals("fail")) {
				Separator.command.setPage("login");
				Separator.command.setView();
			}else{
				Separator.command.setPage("index");
				Separator.command.setView();
				session.setAttribute("user", temp);
				session.setAttribute("id", temp.getId());
				session.setAttribute("pw", temp.getPw());
				session.setAttribute("address", temp.getAddress());
				DispatcherServlet.send2(request, response, Separator.command);
				return;
			}
			break;
		case "logout":
			if (request.getSession().getAttribute("user") == null) {
				Separator.command.setPage("index");
				Separator.command.setView();
				DispatcherServlet.send2(request, response, Separator.command);
				return;
			}else{
				Separator.command.setPage("login");
				Separator.command.setView();
				session.setAttribute("user", bean);
				session.setAttribute("logout", bean);
				session.invalidate();
			}
			break;
		case "mypage":
			if (session.getAttribute("user") == null) {
				Separator.command.setPage("index");
				Separator.command.setView();
				DispatcherServlet.send2(request, response, Separator.command);
				return;
			}else{
				Separator.command.setPage("mypage");
				Separator.command.setView();
				session.setAttribute("member", session.getAttribute("user"));
				break;
			}
		case "update":
			bean.setId((String) session.getAttribute("id"));
			bean.setPw(request.getParameter("pw"));
			bean.setEmail(request.getParameter("email"));
			bean.setPhone(request.getParameter("phone"));
			bean.setAddress(request.getParameter("city")+","+request.getParameter("gu")
			+","+request.getParameter("dong")+","+request.getParameter("bunji"));
			bean.setIntro(request.getParameter("intro"));
			bean = service.update(bean);
			session.setAttribute("user", bean);
			Separator.command.setPage("index");
			Separator.command.setView();
			DispatcherServlet.send2(request, response, Separator.command);
			return;
		
		case "delete":
			if (request.getParameter("pw").equals(session.getAttribute("pw"))) {
				bean.setId((String) session.getAttribute("id"));
				bean.setPw(request.getParameter("pw"));
				service.delete(bean);
				Separator.command.setPage("index");
				Separator.command.setView();
				session.setAttribute("user", bean);
				session.setAttribute("logout", bean);
				session.invalidate();
				DispatcherServlet.send2(request, response, Separator.command);
			}else{
				Separator.command.setPage("mypage");
				Separator.command.setView();
				break;
			}
			return;
		case"mybook":
			request.setAttribute("list", bookservice.list((String) session.getAttribute("id")));
			break;
		case"myhost":
			request.setAttribute("list", hostservice.myhost((String) session.getAttribute("id")));
			break;
		}
		DispatcherServlet.send(request, response, Separator.command);
	}
}

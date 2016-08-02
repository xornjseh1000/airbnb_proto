package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Separator;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		HttpSession session = request.getSession();
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean bean = new MemberBean();
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
			service.login(bean);
			if (bean.getId().equals("fail")) {
				Separator.command.setPage("login");
				Separator.command.setView();
			}else{
				Separator.command.setPage("main");
				Separator.command.setView();
			}
			break;
		}
		
		DispatcherServlet.send(request, response, Separator.command);
	}
}

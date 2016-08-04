package host;

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
import global.ParamMap;
import global.Separator;
import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

@WebServlet("/host.do")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		HttpSession session = request.getSession();
		CityBean bean2 = new CityBean();
		CityService service = CityServiceImpl.getInstance();
		BookService bookservice = BookServiceImpl.getInstance();
		MemberService memberService = MemberServiceImpl.getInstance();
		MemberBean member = (MemberBean) request.getSession().getAttribute("user");
		switch (Separator.command.getAction()) {
		case "temp":
			if (member == null) {
				Separator.command.setDirectory("global");
				Separator.command.setPage("logout");
				Separator.command.setView();
			}else{
				Separator.command.setPage("hosting");
				Separator.command.setView();
			}
			break;
		case "regist":
			bean2.setId((String) session.getAttribute("id"));
			bean2.setHouseType(request.getParameter("housetype"));
			session.setAttribute("regBean", bean2);
			break;
		case "regist2":
			bean2 = (CityBean) session.getAttribute("regBean");
			bean2.setRoom(Integer.parseInt(request.getParameter("room")));
			bean2.setBed(Integer.parseInt(request.getParameter("bed")));
			bean2.setCount(Integer.parseInt(request.getParameter("count")));
			bean2.setToilet(Integer.parseInt(request.getParameter("toilet")));
			bean2.setFacilities(ParamMap.getValues(request, "facilities"));
			bean2.setExplain(request.getParameter("explain"));
			break;
		case "regist3":
			bean2 = (CityBean) session.getAttribute("regBean");
			bean2.setAddress(request.getParameter("address1")+","+request.getParameter("address2")+","+request.getParameter("address3")+","+request.getParameter("address4"));
			System.out.println("세번째 regist : "+bean2);
			service.regist(bean2);
			Separator.command.setPage("index");
			Separator.command.setView();
			DispatcherServlet.send2(request, response, Separator.command);
			session.removeAttribute("regBean");
			return;
		case "list":
			request.setAttribute("list", service.list());
			break;
		case "delete":
			service.delete(request.getParameter("address"));
			bookservice.delete(request.getParameter("address"));
			Separator.command.setPage("index");
			Separator.command.setView();
			DispatcherServlet.send2(request, response, Separator.command);
			return;
		
		}
		
		DispatcherServlet.send(request, response, Separator.command);
	}


}

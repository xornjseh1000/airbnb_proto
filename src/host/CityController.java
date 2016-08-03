package host;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.ParamMap;
import global.Separator;
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
		MemberService memberService = MemberServiceImpl.getInstance();
		switch (Separator.command.getAction()) {
		case "temp":
			if (memberService.getSession() != null) {
				System.out.println("2");
				Separator.command.setPage("hosting");
				Separator.command.setView();
			}else{
				System.out.println("1");
				Separator.command.setDirectory("member");
				Separator.command.setPage("login");
				Separator.command.setView();
			}
			break;
		case "regist":
			bean2.setId(memberService.getSession().getId());
			bean2.setHouseType(request.getParameter("housetype"));
			session.setAttribute("regBean", bean2);
			System.out.println("첫번째 regist : "+bean2);
			break;
		case "regist2":
			bean2 = (CityBean) session.getAttribute("regBean");
			bean2.setRoom(Integer.parseInt(request.getParameter("room")));
			bean2.setBed(Integer.parseInt(request.getParameter("bed")));
			bean2.setCount(Integer.parseInt(request.getParameter("count")));
			bean2.setToilet(Integer.parseInt(request.getParameter("toilet")));
			bean2.setFacilities(ParamMap.getValues(request, "facilities"));
			bean2.setExplain(request.getParameter("explain"));
			System.out.println("두번째 regist : "+bean2);
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
		case "perlist":
			break;
		case "update":
			break;
		case "delete":
			break;
		
		}
		
		DispatcherServlet.send(request, response, Separator.command);
	}


}

package host;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import global.DispatcherServlet;
import global.Separator;

@WebServlet("/host.do")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		HttpSession session = request.getSession();
		CityBean bean = new CityBean();
		CityService service = CityServiceImpl.getInstance();
		switch (Separator.command.getAction()) {
		     
		case "regist":
			bean.setHouseType(request.getParameter("housetype"));
			break;
		case "regist2":
			bean.setRoom(Integer.parseInt(request.getParameter("room")));
			bean.setBed(Integer.parseInt(request.getParameter("bed")));
			bean.setCount(Integer.parseInt(request.getParameter("count")));
			bean.setToilet(Integer.parseInt(request.getParameter("toilet")));
			bean.setExplain(request.getParameter("explain"));
			bean.setAddress(request.getParameter("address1")+","+request.getParameter("address2")+","+request.getParameter("address3")+","+request.getParameter("address4"));
			bean.setId(session.getId());
			service.regist(bean);
			Separator.command.setDirectory("member");
			Separator.command.setPage("login");
			break;
		case "update":
			break;
		case "delete":
			break;
		
		}
		
		DispatcherServlet.send(request, response, Separator.command);
	}


}

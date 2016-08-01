package host;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.DispatcherServlet;
import global.Separator;

@WebServlet("/host.do")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		CityBean bean = new CityBean();
		CityService service = CityServiceImpl.getInstance();
		switch (Separator.command.getAction()) {
		case "regist":
			bean.setHouseType(request.getParameter("rooms"));
			
			break;

		default:
			break;
		}
		
		DispatcherServlet.send(request, response, Separator.command);
	}


}

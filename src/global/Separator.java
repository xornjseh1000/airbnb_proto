package global;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Separator {
	public static CommandFactory factory = new CommandFactory();
	public static Command command;
	public static Command init(HttpServletRequest request, HttpServletResponse response){
		String path = request.getServletPath();
		String temp = path.split("/")[1];
		String directory = temp.substring(0, temp.indexOf("."));
		Enumeration<String> en = request.getParameterNames();
		List<String> list = new ArrayList<String>();
			while (en.hasMoreElements()) {
			list.add((String) en.nextElement());
		}
		System.out.println("Separator.java list : "+ list);
		String action = list.contains("action")?request.getParameter("action"):"move";
		String page = list.contains("page")?request.getParameter("page"):"main";
		System.out.println("Separator.java directory2 : " + directory);
		System.out.println("Separator.java action : " + action);
		System.out.println("Separator.java page : " + page);
		command = factory.createCommand(directory,action,page); 
		return command;
	}
}

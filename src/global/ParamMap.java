package global;

import javax.servlet.http.HttpServletRequest;

public class ParamMap {
	public static String getValues(HttpServletRequest request, String facilities){
		System.out.println("파라미터로 들어왔는까??????");
		String[] values = request.getParameterMap().get(facilities);
		StringBuffer buff = new StringBuffer();
		String str ="";
		for (int i = 0; i < values.length; i++) {
			buff.append(values[i]+",");
		}
		str = buff.toString().substring(0, buff.toString().length()-1);
		System.out.println("파라미터맵 : " +str);
		return str;
	}
}

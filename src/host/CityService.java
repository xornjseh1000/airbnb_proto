package host;

import java.util.List;

public interface CityService {
	public void regist(CityBean bean);
	public void delete(String address);
	public CityBean detail(String seq);
	public List<?> list();
	public List<?> myhost(String id);
}

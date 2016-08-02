package host;

import java.util.List;
import java.util.Map;

public interface CityService {
	public void regist(CityBean bean);
	public void update(CityBean bean);
	public void delete(CityBean bean);
	public Map<?,?>map();
	public void review(CityBean bean);
	public CityBean session();
	public List<?> list();
	public List<?> findByRoom(String keyword);//xx으로 검색기능 만들어봄
}

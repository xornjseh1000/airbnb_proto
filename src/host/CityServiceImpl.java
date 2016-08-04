package host;

import java.util.List;

public class CityServiceImpl implements CityService{
	private CityDAO dao = CityDAO.getInstance();
	private static CityServiceImpl instance = new CityServiceImpl();
	public static CityServiceImpl getInstance() {
		return instance;
	}
	@Override
	public void regist(CityBean bean) {
		dao.insert(bean);
	}
	@Override
	public void delete(String address) {
		dao.delete(address);
	}
	@Override
	public List<?> list() {
		return dao.list();
	}
	@Override
	public CityBean detail(String seq) {
		return dao.findBy(seq);
	}
	@Override
	public List<?> myhost(String id) {
		return dao.myhost(id);
	}

}

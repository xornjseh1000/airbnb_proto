package host;

import java.util.List;
import java.util.Map;

public class CityServiceImpl implements CityService{
	private CityDAO dao = CityDAO.getInstance();
	private CityBean session;
	private static CityServiceImpl instance = new CityServiceImpl();
	
	public static CityServiceImpl getInstance() {
		return instance;
	}
	private CityServiceImpl() {
		session = new CityBean();
	}

	public CityDAO getDao() {
		return dao;
	}

	public CityBean getSession() {
		return session;
	}

	@Override
	public void regist(CityBean bean) {
		dao.insert(bean);
	}

	@Override
	public void update(CityBean bean) {
		dao.update(bean);
	}

	@Override
	public void delete(String address) {
		dao.delete(address);
	}
	
	public List<?> list() {
		return dao.list();
	}

	public CityBean detail(String seq) {
		return dao.findBy(seq);
	}
	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void review(CityBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CityBean session() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<?> myhost(String id) {
		
		return dao.myhost(id);
	}

}

package community;

public class CommunityServiceImpl implements CommunityService{
private CommunityDAO dao = CommunityDAO.getInstance();
private static CommunityServiceImpl instance = new CommunityServiceImpl();

public static CommunityServiceImpl getInstance() {
	return instance;
}

private CommunityServiceImpl() {
	
}

@Override
public void regist(CommunityBean bean) {
	dao.insert(bean);
}

@Override
public void update(CommunityBean bean) {
	dao.update(bean);
}

@Override
public void delete(CommunityBean bean) {
	dao.delete(bean);
}
}

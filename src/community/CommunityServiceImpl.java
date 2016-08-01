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
public void regist(CommunityMemberBean bean) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(CommunityBean bean) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(CommunityBean bean) {
	// TODO Auto-generated method stub
	
}
}

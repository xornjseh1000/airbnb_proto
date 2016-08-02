package guide;

public class GuideBookServiceImpl implements GuideBookService{
private GuideBookDAO dao = GuideBookDAO.getInstance();

private static GuideBookServiceImpl instance = new GuideBookServiceImpl();

public static GuideBookServiceImpl getInstance() {
	return instance;
}

private GuideBookServiceImpl() {
}

@Override
public void search(GuideBookBean bean) {
	
}
}

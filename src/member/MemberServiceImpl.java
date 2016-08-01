package member;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao = MemberDAO.getInstance();
	MemberBean session;
	private static MemberServiceImpl instance = new MemberServiceImpl();

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		session = new MemberBean();
	}

	private MemberBean getSession() {
		return session;
	}

	@Override
	public String regist(MemberBean mBean) {
		String result ="";
		if (dao.regist(mBean) == 1) {
			result = dao.findById(mBean.getId()).getName();
		}
		return result;
	}

	@Override
	public String login(MemberBean member) {
		if (dao.login(member)) {
			session = dao.findById(member.getId());
		}else{
			member.setId("fail");
		}
	return null;
	}

	@Override
	public MemberBean findById(String findID) {
		/* return dao.findById(); */
		return dao.findById(findID);
	}

	@Override
	public void update(MemberBean mem) {
		int result = dao.update(mem);
		if (result == 1) {
			System.out.println("==임플==수정 성공");
		} else {
			System.out.println("==임플==수정 실패");
		}
	}

	@Override
	public void delete(MemberBean member) {
		dao.delete(member);
	}

@Override
public void logout(MemberBean member) {
	if (member.getId().equals(session.getId()) 
			&& member.getPw().equals(session.getPw())) {
		session = null;
	}
	
}
}


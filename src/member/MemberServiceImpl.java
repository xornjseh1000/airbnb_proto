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
	public void regist(MemberBean mBean) {
		dao.regist(mBean);
	}

	@Override
	public String login(MemberBean mBean) {
		MemberBean mem = new MemberBean();
		// 2.로그인
		if (dao.login(mBean)) {
			session = dao.findById(mBean.getId());
			mBean.setId(session.getId());
			mBean.setPw(session.getPw());
			mBean.setName(session.getName());
			mBean.setGender(session.getGender());
			mBean.setEmail(session.getEmail());
			mBean.setBirth(session.getBirth());
			mBean.setPhone(session.getPhone());
			mBean.setAddress(session.getAddress());
			mBean.setIntro(session.getIntro());
			mBean.setSns(session.getSns());
			mBean.setProfileImg(session.getProfileImg());
		} else {
			session.setId("fail");
		}
		System.out.println("로그인된 ID : " + session.getId());

		return null;
	}

	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}

	@Override
	public String update(MemberBean mBean) {
		String update = "";
		if (dao.update(mBean) == 1) {
			update ="성공";
		}else{
			update ="실패";
		}
		return update;
	}


		
	@Override
	public void delete(MemberBean mBean) {
		if (dao.delete(mBean) == 1) {
			session = null;
		}
	}
	
	@Override
	public void logOut(MemberBean mBean) {
		if(mBean.getId().equals(session.getId()) && mBean.getPw().equals(session.getPw())){
			session = null;
			System.out.println("로그아웃 성공");
		}else{ System.out.println("로그아웃 실패");
		}  
	}
}
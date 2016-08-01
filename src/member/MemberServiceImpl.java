package member;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao = MemberDAO.getInstance();
	MemberBean session;
	private static MemberServiceImpl instance = new MemberServiceImpl();

	static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		session = new MemberBean();
	}


	@Override
	public String regist(MemberBean mBean) {
		String msg = "";
		
		int result = dao.resist(mBean);
		if (result==1) {
			msg = "회원가입 축하합니다";
		} else {
			msg = "회원가입 실패";
		}
		return msg;
	}


	@Override
	public String login(MemberBean member) {
/*		MemberBean mBean = new MemberBean();
*/		// 2.로그인
		/*if (dao.login(member)) {
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
		System.out.println("서비스로그인결과?" + session.getId());*/
		return null;
	}

	@Override
	public MemberBean findById(String findID) {
		/*return dao.findById();*/
		return dao.findById(findID);	}


@Override
public void update(MemberBean mem) {
	int result = dao.update(mem);
	if (result == 1) {
		System.out.println("==임플==수정 성공");
	}else{
		System.out.println("서비스 수정결과 실패");
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


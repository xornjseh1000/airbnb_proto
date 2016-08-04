package member;

public class MemberServiceImpl implements MemberService {

	private MemberDAO dao = MemberDAO.getInstance();
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {
		return instance;
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
	public MemberBean login(MemberBean member) {
		if (dao.login(member)) {
			member = dao.findById(member.getId());
			System.out.println("Service 첫 번째 : "+member);
		}else{
			member.setId("fail");
		}
		return member;
	}
	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}
	@Override
	public MemberBean update(MemberBean mem) {
		dao.update(mem);
		mem = dao.findById(mem.getId());
		return mem;
	}
	
	@Override
	public void delete(MemberBean member) {
		dao.delete(member);
	}
}
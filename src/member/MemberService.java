package member;

public interface MemberService {
	public MemberBean regist(MemberBean bean);
	public MemberBean login(MemberBean bean);
	public void update(MemberBean bean);
	public void delete(MemberBean bean);		
}

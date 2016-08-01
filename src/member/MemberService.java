package member;
public interface MemberService {
	
	public void regist(MemberBean mBean);
	public String login(MemberBean mBean);
	public void update(MemberBean mBean);
	public void delete(MemberBean mBean);
	public void logOut(MemberBean mBean);
	MemberBean findById(String findID);
}

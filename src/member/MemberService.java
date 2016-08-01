
package member;
public interface MemberService {
	
	public void regist(MemberBean mBean);
	public String login(MemberBean mBean);
	public void update(MemberBean mBean);
	public void delete(MemberBean mBean);
	MemberBean findById(String findID);
	public void logout(MemberBean member);
}

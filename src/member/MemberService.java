
package member;
public interface MemberService {
	
	public String regist(MemberBean mBean);
	public void login(MemberBean mBean);
	public void update(MemberBean mBean);
	public void delete(MemberBean mBean);
	MemberBean findById(String findID);
	public MemberBean getSession();
}
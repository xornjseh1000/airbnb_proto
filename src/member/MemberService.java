
package member;
public interface MemberService {
	
	public String regist(MemberBean mBean);
	public MemberBean login(MemberBean mBean);
	public MemberBean update(MemberBean mBean);
	public void delete(MemberBean mBean);
	MemberBean findById(String findID);
}
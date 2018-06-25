package serviceImpl;
import java.util.List;
import java.util.ArrayList;
import domain.*;
import service.*;
import repository.*;
import repositoryImpl.*;
public class MemberServiceImpl implements MemberService {
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}

	@Override
	public void createUser(UserBean member) {
		
		System.out.println("========= 멤버 서비스 ===========");
		System.out.println("컨트롤러에서 넘어온 객체:"+member);
		member.setCreditRating("7등급");
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public String login(MemberBean member) {
		MemberBean mbr = new MemberBean();
		/*for (MemberBean e : list) {
			if (member.getUid().equals(e.getUid())) {
				mbr = e;
				break;
			}
		}*/
		return "";
	}

	@Override
	public void updatePassword(MemberBean member) { // new pass만 가지고 있을 것 같음
		String oldPass = member.getPass().split("/")[0];
		String newPass = member.getPass().split("/")[1];
		MemberBean mbr = new MemberBean();
		mbr.setPass(oldPass);
		//list.get(list.indexOf(findById(mbr))).setPass(newPass);
	}

	@Override
	public void deleteMember(MemberBean member) {
		//list.remove(list.indexOf(findById(member)));
		// list.remove(search(member)); 위를 줄이면 아래와같이 할 수 있다.
	}
}

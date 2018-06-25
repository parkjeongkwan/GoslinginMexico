package controller;
import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;
import service.*;

public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	
	
	public void join(UserBean member) {
		System.out.println("========= 멤버 컨트롤러 ===========");
		System.out.println("화면에서 넘어온 객체:"+member);
		MemberServiceImpl.getInstance().createUser(member);
	}



	public void update() {
		MemberBean member = null;
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("ID?"));
		member.setUid(JOptionPane.showInputDialog("OldPass?") + "/" + (JOptionPane.showInputDialog("NewPass?")));
		MemberServiceImpl.getInstance().updatePassword(member);
	}

	public void withdrawal() {
		MemberBean member = null;
		member = new StaffBean();
		member.setUid(JOptionPane.showInputDialog("ID?"));
		member.setUid(JOptionPane.showInputDialog("Pass?"));
		MemberServiceImpl.getInstance().deleteMember(member);
	}
}
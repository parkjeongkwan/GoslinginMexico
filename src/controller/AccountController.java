package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MinusAccountBean;
import serviceImpl.*;
import service.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController(){};


	public void account() {
		AccountBean account = null;
		account = new AccountBean();
		account.setName(JOptionPane.showInputDialog("Name?"));
		account.setUid(JOptionPane.showInputDialog("ID?"));
		account.setPass(JOptionPane.showInputDialog("Pass?"));
		AccountServiceImpl.getInsatnce().createAccount(account);
	}
	
	

	public void findById() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		JOptionPane.showMessageDialog(null, AccountServiceImpl.getInsatnce().findById(account));
	}

	public void changePass() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		account.setPass((JOptionPane.showInputDialog("old Pass?") + "/" + (JOptionPane.showInputDialog("New Pass?"))));
		AccountServiceImpl.getInsatnce().update(account);
	}

	public void deleteAccount() {
		AccountBean account = null;
		account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("ID?"));
		AccountServiceImpl.getInsatnce().delete(account);
	}
}
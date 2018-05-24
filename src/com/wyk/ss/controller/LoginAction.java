package com.wyk.ss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wyk.ss.entity.LoginActionForm;
import com.wyk.ss.manager.LoginManager;

public class LoginAction extends Action{
	
	private LoginManager loginManager;
	
	public void setLoginManager(LoginManager loginManager) {
		this.loginManager = loginManager;
	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		LoginActionForm bean = (LoginActionForm)form;
		String username = bean.getUsername();
		String pwd = bean.getPassword();
		
		loginManager.login(username, pwd);
		
		
		return mapping.findForward("success");
	}

}

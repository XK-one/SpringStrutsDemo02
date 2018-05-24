package com.wyk.ss.entity;

import org.apache.struts.action.ActionForm;

import com.wyk.ss.controller.LoginAction;

public class LoginActionForm extends ActionForm {
	
	 //用户名。  
    private String username;  
    //密码。  
    private String password;  
     
    //设置密码。  
    public void setPassword(String password) {  
       this.password = password;  
    }  
    //得到用户名。  
    public String getUsername() {  
       return username;  
    }  
    //设置用户名。  
    public void setUsername(String username) {  
       this.username = username;  
    }  
    //得到密码。  
    public String getPassword() {  
     
       return password;  
    }  

}

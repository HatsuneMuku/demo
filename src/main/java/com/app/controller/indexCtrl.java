package com.app.controller;

import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class indexCtrl {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/user-main")
    public String usermain(){
        return "user-main";
    }

    @RequestMapping("/manage")
    public String manage(){
        return "manage";
    }

    @RequestMapping("/user-login")
    public String userlogin(){
        return "user-login";
    }

    @RequestMapping("/user-register")
    public String userregister(){
        return "user-register";
    }

    @RequestMapping("/forget-pwd")
    public String forgetpwd(){
        return "forget-pwd";
    }

    @RequestMapping("/manage-home")
    public String managehome(){
        return "manage-home";
    }

    @RequestMapping("/manage-failed")
    public String managefailed(){
        return "manage-failed";
    }

    @RequestMapping("/manage-success")
    public String managesuccess(){
        return "manage-success";
    }

    @RequestMapping("/info")
    public String info(){
        return "info";
    }

    @RequestMapping("/login-info")
    public String logininfo(){
        return "login-info";
    }

    //登录方法
    @RequestMapping("/doLogin")
    public String doLogin(HttpServletRequest request){
        boolean result=userService.doLogin(request);
        String msg="";
        if(result){
            msg="登录成功";
            return "index";
        }else{
            msg="用户名或密码错误";
            return "login";
        }
    }

    //注册方法
    @RequestMapping("/doRegister")
    public String doRegister(HttpServletRequest request){
        boolean result=userService.doLogin(request);
        String msg="";
        if(result){
            msg="注册成功";
            return "success";
        }else{
            msg="注册失败";
            return "register";
        }
    }

    //找回密码
    @RequestMapping("/doRegister")
    public String doForgetPwd(HttpServletRequest request){
        boolean result=userService.doForgetPwd(request);
        String msg="";
        if(result){
            msg="找回密码成功";
            return "success";
        }else{
            msg="找回密码失败失败";
            return "register";
        }
    }

}

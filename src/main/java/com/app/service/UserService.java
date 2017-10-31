package com.app.service;


import com.app.dao.UserDao;
import com.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 登录
     * @param request
     * @return
     */
    public boolean doLogin(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user=new User();
        try{
            user = userDao.getUserByUserName(userName);
        }catch (Exception e){
        }
        if (user !=null && user.getPassword()==password){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 注册
     * @param request
     * @return
     */
    public boolean doRegister(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String nickName = request.getParameter("nickName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String website = request.getParameter("website");
        String activeCode = request.getParameter("activeCode");
        if ("mayukirin".equals(userName)){
            User user = new User();
            user.setUserName(userName);
            user.setPassword(password);
            user.setNickName(nickName);
            user.setEmail(email);
            user.setPhoneNumber(phoneNumber);
            user.setWebsite(website);
            user.setActive(true);
            try{
                userDao.insertUser(user);
            }catch (Exception e){

            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * 找回密码
     * @param request
     * @return
     */
    public boolean doForgetPwd(HttpServletRequest request){
        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");
        if ("12345678@qq.com".equals(email)){
            try{
                userDao.updatePasswordByEmail(newPassword);
            }catch (Exception e){

            }
            return true;
        }else {
            return false;
        }
    }
}

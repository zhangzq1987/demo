/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: HelloController
 * Author:   Administrator
 * Date:     2019/8/22 8:57
 * Description: 1
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.unit.controller;

import com.example.unit.model.UnitEntity;
import com.example.unit.service.UnitLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br> 
 * 〈1〉
 *
 * @author Administrator
 * @create 2019/8/22
 * @since 1.0.0
 */
//主登陆页面 http://localhost:8080/unit/loginHtml
@Controller
@RequestMapping(value = {"/unit"})
public class HelloController {
    @Autowired
    private UnitLoginService unitLoginService;

    @RequestMapping(value = {"/springboot"})
    public String hello(){
        return  "HelloWord";
    }


    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml(){
        return "userLogin";
    }

    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @RequestMapping(value = {"/registerpage"})
    public String registerpage(){
        return "register";
    }

    /**
     * 获取用户名与密码，用户登录
     * @return 登录成功页面
     */
    @RequestMapping(value = {"/userLogin"})
    public String userLogin(@RequestParam("name") String name, @RequestParam("code") String code, HttpServletRequest request){

        UnitEntity unitEntity = unitLoginService.userLogin(name,code);

        if(unitEntity != null){                                                  //登录成功
            request.getSession().setAttribute("session_user",unitEntity);     //将用户信息放入session
            return "index";
        }
        return "loginError";
    }

    /**
     * 注册新用户
     * @return 注册结果
     */
    @ResponseBody
    @RequestMapping(value = {"/uregister"})
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("code") String code,
                          @RequestParam("address") String address
                          ){
        if(!code.equals(address)){

            return "两次密码不相同，注册失败！！";
        }else {
            int res = unitLoginService.adduser(name,code,address);
            if(res == 0){
                return "注册失败！";
            }else {
                return "注册成功！";
            }
        }

    }




}

/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserDomain
 * Author:   Administrator
 * Date:     2019/6/21 15:03
 * Description: 5
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.model;

/**
 * 〈一句话功能简述〉<br> 
 * 〈5〉
 *
 * @author Administrator
 * @create 2019/6/21
 * @since 1.0.0
 */
public class UserDomain {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}

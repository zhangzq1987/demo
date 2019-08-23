/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UnitLoginService
 * Author:   Administrator
 * Date:     2019/8/22 9:26
 * Description: 2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.unit.service;

import com.example.unit.dao.UnitEntityMapper;
import com.example.unit.model.UnitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈2〉
 *
 * @author Administrator
 * @create 2019/8/22
 * @since 1.0.0
 */
@Service
public class UnitLoginService {
    /**
     * 注入dao
     */
    @Autowired
    private UnitEntityMapper unitEntityMapper;

    //用户登录
    public UnitEntity userLogin(String name, String code){
        UnitEntity user = unitEntityMapper.userlogin(name,code);
        return user;
    }

    //注册新用户
    public int adduser(String name,String code,String address){


        return unitEntityMapper.adduser(name,code,address);
        //return unitEntityMapper.adduser1(name,code,address);     //对应sql语句中的第二种注册方式
    }

}

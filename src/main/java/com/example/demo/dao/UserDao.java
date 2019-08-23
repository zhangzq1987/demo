/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserDao
 * Author:   Administrator
 * Date:     2019/6/21 15:02
 * Description: 4
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao;

import com.example.demo.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈4〉
 *
 * @author Administrator
 * @create 2019/6/21
 * @since 1.0.0
 */
@Mapper
@Component
public interface UserDao {
    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}

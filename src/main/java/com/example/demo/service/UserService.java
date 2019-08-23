/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserService
 * Author:   Administrator
 * Date:     2019/6/21 15:01
 * Description: 2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.model.UserDomain;
import com.github.pagehelper.PageInfo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈2〉
 *
 * @author Administrator
 * @create 2019/6/21
 * @since 1.0.0
 */
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}

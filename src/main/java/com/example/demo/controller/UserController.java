/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: UserController
 * Author:   Administrator
 * Date:     2019/6/21 14:57
 * Description: 1
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.model.UserDomain;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈1〉
 *
 * @author Administrator
 * @create 2019/6/21
 * @since 1.0.0
 */
@Controller
@Api(description = "用户接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {//http://localhost:8080/swagger-ui.html#/
    @Autowired
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @ApiOperation(value = "查询用户" ,  notes="查询用户")
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

}

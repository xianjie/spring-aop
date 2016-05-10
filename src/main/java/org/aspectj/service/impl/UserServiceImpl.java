package org.aspectj.service.impl;

import org.aspectj.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: xian jie
 * @date: 2016/5/6 15:50
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    public void addUser() {
        System.out.println("新增用户");

        //String aa = "jack";

       // System.out.println(Integer.parseInt(aa));
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

    public void findUser() {
        System.out.println("查询用户");
    }

    public void modifyUser() {
        System.out.println("修改用户");
    }
}

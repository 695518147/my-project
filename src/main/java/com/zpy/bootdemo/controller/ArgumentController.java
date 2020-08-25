/**
 *Author: zhangpeiyu
 *Date: 2020-08-15 02:07:14
 *LastEditTime: 2020-08-26 00:56:43
 *Description: 我不是诗人，所以，只能够把爱你写进程序，当作不可解的密码，作为我一个人知道的秘密。
 */
package com.zpy.bootdemo.controller;

import com.zpy.bootdemo.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * form表单数据的三种接收方式
 * @author zhangpeiyu
 * @since 2020-08-25
 */
@RequestMapping("argument")
@RestController
@Slf4j
public class ArgumentController {

    /**
     * form表单数据实体接收
     * 
     * @param userName
     * @return
     */
    @PostMapping
    public String test1(@RequestParam("userName")String userName) {
        log.info(userName);
        return userName;
    }



}
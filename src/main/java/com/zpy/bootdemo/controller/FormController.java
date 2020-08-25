/**
 *Author: zhangpeiyu
 *Date: 2020-08-15 02:07:14
 *LastEditTime: 2020-08-26 00:56:43
 *Description: 我不是诗人，所以，只能够把爱你写进程序，当作不可解的密码，作为我一个人知道的秘密。
 */
package com.zpy.bootdemo.controller;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.zpy.bootdemo.bean.User;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * form表单数据的三种接收方式
 * @author zhangpeiyu
 * @since 2020-08-25
 */
@RequestMapping("form")
@RestController
@Slf4j
public class FormController {

    /**
     * form表单数据实体接收
     * 
     * @param user
     * @return
     */
    @PostMapping("form-bean")
    public String test1(User user) {
        log.info(user.toString());
        return user.toString();
    }

    /**
     * form表单数据string接收
     * 
     * @param user
     * @return
     */
    @PostMapping("form-str")
    public String test2(@RequestBody String user) {
        log.info(user);
        return user.toString();
    }

    /**
     * form表单数据map接收
     * 
     * @param user
     * @return
     */
    @PostMapping("form-map")
    public String test3(@RequestParam Map<String, String> user) {
        log.info(JSONObject.toJSONString(user));
        return user.toString();
    }

}
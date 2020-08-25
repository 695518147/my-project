/**
 *Author: zhangpeiyu
 *Date: 2020-08-15 00:52:51
 *LastEditTime: 2020-08-15 02:26:47
 *Description: 我不是诗人，所以，只能够把爱你写进程序，当作不可解的密码，作为我一个人知道的秘密。
 */
package com.zpy.bootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Test
	void contextLoads() {
		int a = 5;
		int b = 3;
		int c = a/b;
		log.info("运行了测试方法；");
	}

}

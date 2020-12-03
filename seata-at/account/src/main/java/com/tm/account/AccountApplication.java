package com.tm.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.java2d.pipe.AAShapePipe;

@MapperScan("com.tm.account.mapper")
@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		System.out.println("ヾ(◍°∇°◍)ﾉﾞ    AccountApplication启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
	}

}

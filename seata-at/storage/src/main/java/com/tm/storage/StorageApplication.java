package com.tm.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tm.storage.mapper")
@SpringBootApplication
public class StorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageApplication.class, args);
		System.out.println("ヾ(◍°∇°◍)ﾉﾞ    StorageApplication启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
	}

}

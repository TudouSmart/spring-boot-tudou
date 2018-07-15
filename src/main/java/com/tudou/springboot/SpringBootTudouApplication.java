package com.tudou.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.tudou.springboot.db.mapper")
public class SpringBootTudouApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTudouApplication.class, args);
		System.out.println("                       .::::.									");
		System.out.println("                     .::::::::.									");
		System.out.println("                    :::::::::::									");
		System.out.println("                 ..:::::::::::'									");
		System.out.println("              '::::::::::::'									");
		System.out.println("                .::::::::::										");
		System.out.println("           '::::::::::::::..									");
		System.out.println("                ..::::::::::::.									");
		System.out.println("              ``::::::::::::::::								");
		System.out.println("               ::::``:::::::::'        .:::.					");
		System.out.println("              ::::'   ':::::'       .::::::::.					");
		System.out.println("            .::::'      ::::     .:::::::'::::.					");
		System.out.println("           .:::'       :::::  .:::::::::' ':::::.				");
		System.out.println("          .::'        :::::.:::::::::'      ':::::.				");
		System.out.println("         .::'         ::::::::::::::'         ``::::.			");
		System.out.println("     ...:::           ::::::::::::'              ``::.			");
		System.out.println("    ```` ':.          ':::::::::'                  ::::..		");
		System.out.println("                       '.:::::'                    ':'````..	");
	}
}

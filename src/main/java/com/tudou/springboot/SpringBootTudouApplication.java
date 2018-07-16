package com.tudou.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.tudou.springboot.db.mapper")
public class SpringBootTudouApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootTudouApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTudouApplication.class, args);
		LOGGER.info("                       .::::.										");
		LOGGER.info("                     .::::::::.									");
		LOGGER.info("                    :::::::::::									");
		LOGGER.info("                 ..:::::::::::'									");
		LOGGER.info("              '::::::::::::'										");
		LOGGER.info("                .::::::::::										");
		LOGGER.info("           '::::::::::::::..										");
		LOGGER.info("                ..::::::::::::.									");
		LOGGER.info("              ``::::::::::::::::									");
		LOGGER.info("               ::::``:::::::::'        .:::.						");
		LOGGER.info("              ::::'   ':::::'       .::::::::.						");
		LOGGER.info("            .::::'      ::::     .:::::::'::::.					");
		LOGGER.info("           .:::'       :::::  .:::::::::' ':::::.					");
		LOGGER.info("          .::'        :::::.:::::::::'      ':::::.				");
		LOGGER.info("         .::'         ::::::::::::::'         ``::::.				");
		LOGGER.info("     ...:::           ::::::::::::'              ``::.				");
		LOGGER.info("    ```` ':.          ':::::::::'                  ::::..			");
		LOGGER.info("                       '.:::::'                    ':'````..		");
	}
}

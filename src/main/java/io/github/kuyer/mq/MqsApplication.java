package io.github.kuyer.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消息服务启动
 * @author rory.zhang
 */
@SpringBootApplication
public class MqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqsApplication.class, args);
	}

}

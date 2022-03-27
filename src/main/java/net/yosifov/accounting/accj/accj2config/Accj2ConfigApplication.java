package net.yosifov.accounting.accj.accj2config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Accj2ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Accj2ConfigApplication.class, args);
	}

}

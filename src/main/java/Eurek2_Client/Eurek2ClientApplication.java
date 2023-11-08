package Eurek2_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class Eurek2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eurek2ClientApplication.class, args);
	}
	@RequestMapping("/wel")
	public   String getM1()
	{
		return "Hello EurekaClient";
	}

}

package com.melon.Recruitment_Assistance_Tool_Microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RecruitmentAssistanceToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentAssistanceToolApplication.class, args);
	}

}

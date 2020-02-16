package com.springsecurity.jpa.springbootsecurityjpa;

import com.springsecurity.jpa.springbootsecurityjpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
//@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
public class SpringbootSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJpaApplication.class, args);
	}

}

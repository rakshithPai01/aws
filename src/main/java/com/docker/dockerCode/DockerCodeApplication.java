package com.docker.dockerCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;

@SpringBootApplication
public class DockerCodeApplication {
	@RequestMapping("/hey")
	public String home(@PathVariable String fileName) throws Exception {
				return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerCodeApplication.class, args);
	}

}

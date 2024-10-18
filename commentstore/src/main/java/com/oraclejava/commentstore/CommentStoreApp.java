package com.oraclejava.commentstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.oraclejava.model"})
public class CommentStoreApp {

	public static void main(String[] args) {
		SpringApplication.run(CommentStoreApp.class, args);

	}

}

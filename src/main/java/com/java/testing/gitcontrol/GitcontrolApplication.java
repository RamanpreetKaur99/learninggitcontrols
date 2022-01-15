package com.java.testing.gitcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitcontrolApplication {

	// Comment added in branch B-1
	private int i = 1;
	// Comment added in branch main
	public static void main(String[] args) {
		SpringApplication.run(GitcontrolApplication.class, args);
	}

}

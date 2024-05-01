package com.example.DemoDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}
	/*
	* 	echo "# CI-CD" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/utk-pydev/CI-CD.git
git push -u origin main
	*
	*
	* */

}

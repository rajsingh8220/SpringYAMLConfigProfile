package com.ssingh.yml.configdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamlSpringConfigProfileApplication implements CommandLineRunner{
	
	@Autowired
	private YAMLConfig myConfig;

	public static void main(String[] args) {
		
		SpringApplication myapp = new SpringApplication(YamlSpringConfigProfileApplication.class);
		
		//SpringApplication.run(YamlSpringConfigProfileApplication.class, args);
		myapp.run();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("using environment: " + myConfig.getEnvironment());
		System.out.println("name: " + myConfig.getName());
		System.out.println("servers: "+ myConfig.getServers());
	}

}

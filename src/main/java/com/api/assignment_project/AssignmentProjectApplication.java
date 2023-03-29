package com.api.assignment_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AssignmentProjectApplication implements CommandLineRunner {

	@Autowired
	ServerRepository serverItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentProjectApplication.class, args);
	}

	void createTestServers() {
		serverItemRepo.save(new Server(
			"1", 
			"test server", 
			"java", 
			"spring boot"
		));
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server started");	
	}

}

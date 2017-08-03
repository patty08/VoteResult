package com.vote.resultat.vote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.PersistenceUnit;

@SpringBootApplication
public class VoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
	}
}

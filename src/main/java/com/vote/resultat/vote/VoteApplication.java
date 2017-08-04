package com.vote.resultat.vote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoteApplication {
	/*
	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory());
	}

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		return lsfb.getObject();
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
	}
}

package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

}
/*
* Добавить в базе User и Admin полученные зашифрованные данные, шифровка в классе (EncodePasswords)
* либо
* User:   $2a$10$NMdmfzJte.YIG0Ic1nUznuEqWqgr508JMy.ocWS8fmL91h2EXzBO.
* Admin: 	$2a$10$nE2Hm9iVzcUqZMPIdKTjYeQuZ3mW8PtGlWTuh8wsXZnVtzdsWH30m
*/
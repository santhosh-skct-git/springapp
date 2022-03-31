package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.dao.LoginDao;
import com.examly.springapp.model.Login;

@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}


}



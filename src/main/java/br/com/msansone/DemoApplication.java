package br.com.msansone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		
	}


}

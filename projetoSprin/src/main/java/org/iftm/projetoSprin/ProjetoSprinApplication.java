package org.iftm.projetoSprin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSprinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSprinApplication.class, args);
		
		short b = 127;
		short a = 300;
		
		short soma = (short)(a+b);
		short menos = 1;
		
		System.out.print(soma);
		
		
		
		
		
		
	}

}

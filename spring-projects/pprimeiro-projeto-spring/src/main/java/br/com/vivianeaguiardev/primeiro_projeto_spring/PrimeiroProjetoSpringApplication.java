package br.com.vivianeaguiardev.primeiro_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.vivianeaguiardev")
public class PrimeiroProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
    }

}
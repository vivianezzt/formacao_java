package com.viviane.fundamentos.je14JavaNew;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO4 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\arquivos\\aula-java-nio.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("Viviane Aguiar");
            nomes.add("João da Silva");
            nomes.add("Maria Oliveira");
            nomes.add("Pedro Santos");
            nomes.add("Ana Paula");
            nomes.add("Carlos Eduardo");

            StringBuilder sb = new StringBuilder();
            nomes.forEach(n -> sb.append(n + "/n"));

            Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

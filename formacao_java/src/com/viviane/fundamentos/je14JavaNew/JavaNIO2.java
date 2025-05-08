package com.viviane.fundamentos.je14JavaNew;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaNIO2 {
    public static void main(String[] args) {
      try {
        // Primeiro utilize o Path para localizar o arquivo
        // linux:"/home/arquivos/aula-java-nio.txt"
        Path path = Paths.get("C:\\arquivos\\aula-java-nio.txt");
        String conteudo = "Viviane Aguiar";
        // Escrevendo o conteúdo no arquivo
        Files.writeString(path, conteudo, StandardCharsets.UTF_8);
        // Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
        byte[] bytesArquivo =  Files.readAllBytes(path);
  
        // Como são bytes podemos criar uma String a partir de agora
        String conteudo2 = new String(bytesArquivo);
        System.out.println(conteudo2);
  
        // Agora veja como também é simples escrever arquivos textos.
        Path pathTo = Paths.get("C:\\arquivos\\aula-java-nio-copy.txt");
        Files.write(pathTo, bytesArquivo);
        // Lendo todas as linhas do arquivo
        List<String> linhas = Files.readAllLines(path);
        linhas.forEach(l -> System.out.println(l));
        System.out.println(linhas);
  
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
package com.viviane.fundamentos.je14JavaNew;

import java.io.File;

public class JavaNIO {
    public static void main(String[] args) {
        File diretorio = new File("D:\\workspaces\\rocketseat");
        System.out.println("Diretório: " + diretorio.getAbsolutePath()); // diretorio absoluto
        System.out.println("Diretório: " + diretorio.getPath()); // diretorio relativo
        System.out.println("Diretório: " + diretorio.getName()); // nome do diretorio
        System.out.println("Diretório: " + diretorio.getParent()); // diretorio pai
        System.out.println("Diretório: " + diretorio.exists()); // verifica se o diretorio existe
        System.out.println("Diretório: " + diretorio.isDirectory()); // verifica se é um diretorio

        File arquivo = new File("D:\\rocketseatViviane\\cursoJava");
        System.out.println(arquivo.exists());
        if (!arquivo.exists()) {
            arquivo.mkdir();
            System.out.println("Diretório criado com sucesso!");
        }

        try{
         File arquivo2 = new File("D:\\rocketseatViviane\\cursoJava\\viviane.txt");
           System.out.println(arquivo2.exists());
           if(!arquivo2.exists()){
            arquivo2.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
           }

           arquivo.createNewFile();
           System.out.println(arquivo2.exists());
         } catch (Exception e) {
            e.printStackTrace();
         }
    }
}

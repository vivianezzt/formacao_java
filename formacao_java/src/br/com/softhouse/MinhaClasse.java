package br.com.softhouse;

import java.math.BigDecimal;
import br.com.softhouse.model.User;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Viviane";
        Integer idade = 25;
        BigDecimal altura = new BigDecimal(1.70);
        System.out.println("Nome: " + primeiroNome + " Idade: " + idade + " Altura: " + altura);

        User user = new User();
        user.showMyName();
    }
}

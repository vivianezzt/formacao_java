package br.com.vivianeaguiardev.ioc_di;

import org.springframework.stereotype.Component;

// Agora o Spring gerencia esse componente
@Component
public class MeuComponent {
    public String chamarMeuComponent(){
        return "Chamei o meu componente!";
    }
}

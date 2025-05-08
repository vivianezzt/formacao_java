package br.com.vivianeaguiardev.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST
@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;
    // O Spring vai injetar o MeuComponent aqui
    // O Spring vai gerenciar o ciclo de vida do MeuComponent
    
    @GetMapping("/")
    public String chamandoComponent() {
        // Agora o componente foi injetado pelo Spring
        return meuComponent.chamarMeuComponent();
    }
}

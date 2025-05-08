package br.com.vivianeaguiardev.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta classe é um controller REST
@RestController
// Define o prefixo de rota para todos os métodos desta classe
@RequestMapping("/primeiraController")
public class HelloController {

    // Define que esse método responde a requisições GET em /primeiraController/primeiroMetodo
    @GetMapping("/primeiroMetodo/{id}") // {id} é um parâmetro de rota
    public String hello(@PathVariable String id) { // O valor de {id} será passado como argumento para o método
        return "Parabens! voce criou sua primeira rota! O parametro e" + id;
    }
    @GetMapping("/metodoComQueryParams") // Define que esse método responde a requisições GET em /primeiraController/metodoComQueryParams
    public String metodoComQueryParams(@RequestParam String id){ // O valor de ?id=valor será passado como argumento para o método
        // @RequestParam indica que o parâmetro é um parâmetro de consulta (query parameter)
        return "Parabens! voce criou sua primeira rota com query params! O parametro e" + id;

    }
    @GetMapping("/metodoComQueryParams2") 
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams){ // O valor de ?id=valor será passado como argumento para o método
        return "O parametro com metodoComQueryParams2 e" + allParams.entrySet();
    }
    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBodyParams " + usuario.username();
    }
    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name){
        return "metodoComHeaders " + name;
    }
    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers){
        return "metodoComListHeaders " + headers.entrySet();
    }
    @GetMapping("/metodoComResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario("Viviane"); 
        if(id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Numero menor que 5");
        
    }
    public record Usuario(String username) {}
    // Definindo um record para representar o corpo da requisição

}

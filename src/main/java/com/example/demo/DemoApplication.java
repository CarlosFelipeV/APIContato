package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RequestMapping
@SpringBootApplication
public class DemoApplication {

    @GetMapping("contato")
    public String CriarUsuario() {
        return "Criado com sucesso";
    }

    @PostMapping("contato")
    public String AtualizarUsuario() {
        return "Atualizado com sucesso";
    }

    @PutMapping("contato")
    public String PuxarrUsuario() {
        return "Sucesso";
    }

    @DeleteMapping("contato")
    public String DeletarUsuario() {
        return "Sucesso";
    }




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
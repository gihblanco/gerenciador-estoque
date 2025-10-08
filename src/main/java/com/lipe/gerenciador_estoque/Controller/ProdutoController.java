package com.lipe.gerenciador_estoque.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @GetMapping
    public String produto() {
        return "Daê! Aqui é o server, fique alerta que temos novos produtos chegando por aqui!";
    }
}
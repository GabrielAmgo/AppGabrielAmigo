package com.infnet.appGabrielAmigo.Controller;

import com.infnet.appGabrielAmigo.Service.LivroService;
import com.infnet.appGabrielAmigo.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping(value = "livro/listar")
    public Iterable<Livro> obterLista(){
        return livroService.obterLista();
    }

    @GetMapping(value = "livro/{id}")
    public Livro obterLivroPorId(@PathVariable int id){
        return livroService.obterLivroPorId(id);
    }

    @PostMapping(value = "livro/incluir")
    public String incluirLivro(@PathVariable Livro livro){
        livroService.incluir(livro);
        return "Inclusão realizada!";
    }

    @DeleteMapping(value = "livro/excluir/{id}")
    public String excluirLivro(@PathVariable int id){
        livroService.excluirLivro(id);
        return "Exclusão realizada!";
    }

}

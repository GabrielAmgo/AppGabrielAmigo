package com.infnet.appGabrielAmigo.Controller;

import com.infnet.appGabrielAmigo.Service.RevistaService;
import com.infnet.appGabrielAmigo.model.Revista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class RevistaController {
    @Autowired
    private RevistaService revistaService;

    @GetMapping(value = "revista/listar")
    public Iterable<Revista> obterLista(){
        return revistaService.obterLista();
    }
    @GetMapping(value = "revista/{id}")
    public Revista obterPorId(@PathVariable int id){
        return revistaService.obterPorId(id);
    }
    @PostMapping(value = "revista/incluir")
    public String incluir(@RequestBody Revista revista){
        revistaService.incluir(revista);
        return "Inclusão realizada";
    }
    @DeleteMapping(value = "revista/excluir/{id}")
    public String excluirRevista(@PathVariable int id){
        revistaService.excluirRevista(id);
        return "Exclusão realizada";
    }
}

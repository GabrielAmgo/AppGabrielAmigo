package com.infnet.appGabrielAmigo.Controller;

import com.infnet.appGabrielAmigo.Service.CarrinhoService;
import com.infnet.appGabrielAmigo.model.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;
    @GetMapping(value = "carrinho/listar")
    public Iterable<Carrinho> obterLista(){
        return carrinhoService.obterLista();
    }
    @GetMapping(value = "carrinho/{id}")
    public Carrinho obterCarrinhoPorId(@PathVariable int id){
        return carrinhoService.obterPorId(id);
    }

    @PostMapping(value = "carrinho/incluir")
    public String incluir (@PathVariable Carrinho carrinho){
        carrinhoService.incluir(carrinho);
        return "Inclusão concluida";
    }

    @DeleteMapping(value = "carrinho/excluir/{id}")
    public String excluirCarrinho (@PathVariable int id){
        carrinhoService.excluirCarrinho(id);
        return "Exclusão concluida";
    }
}

package com.infnet.appGabrielAmigo.Controller;

import com.infnet.appGabrielAmigo.Service.CarrinhoService;
import com.infnet.appGabrielAmigo.Service.LivroService;
import com.infnet.appGabrielAmigo.Service.ProdutoService;
import com.infnet.appGabrielAmigo.Service.RevistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @Autowired
    private CarrinhoService carrinhoService;
    @Autowired
    private RevistaService revistaService;
    @Autowired
    private LivroService livroService;
    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/")
    public String telaHome(Model model){

        model.addAttribute("qtdeVendedor", carrinhoService.obterQtde());
        model.addAttribute("qtdeProduto", produtoService.obterQtde());
        model.addAttribute("qtderevista", revistaService.obterQtde());
        model.addAttribute("qtdeEletronico", livroService.ObterQtde());

        return "home";
    }

    @GetMapping(value = "/carrinho/listagem")
    public String listarCarrinho(Model model) {
        model.addAttribute("titulo", "Listagem de carrinhos");
        model.addAttribute("listagem", carrinhoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/produto/listar")
    public String listarProduto(Model model) {

        model.addAttribute("titulo", "Listagem de produtos");
        model.addAttribute("listagem", produtoService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/revista/listar")
    public String listarRevista(Model model) {

        model.addAttribute("titulo", "Listagem de revistas");
        model.addAttribute("listagem", revistaService.obterLista());

        return telaHome(model);
    }

    @GetMapping(value = "/livro/listar")
    public String listarLivro(Model model) {

        model.addAttribute("titulo", "Listagem de livros");
        model.addAttribute("listagem", livroService.obterLista());

        return telaHome(model);
    }
}

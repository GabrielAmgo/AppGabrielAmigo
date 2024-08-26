package com.infnet.appGabrielAmigo.Service;


import java.util.Collection;

import com.infnet.appGabrielAmigo.Repository.ProdutoRepository;
import com.infnet.appGabrielAmigo.model.Carrinho;
import com.infnet.appGabrielAmigo.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Iterable<Produto> obterLista(){
        return produtoRepository.findAll();
    }

    public long obterQtde() {
        return produtoRepository.count();
    }

}

package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.model.Carrinho;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class CarrinhoService {
    private Map<Integer, Carrinho> mapa = new HashMap<Integer, Carrinho>();
    private Integer id = 0;

    public  void incluir(Carrinho carrinho){
        carrinho.setCodigo(++id);

        mapa.put(carrinho.getCodigo(), carrinho);
    }

    public Collection<Carrinho> obterLista(){
        return mapa.values();
    }
}

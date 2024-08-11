package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.model.Livro;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LivroService {
    private Map<Integer, Livro> mapa = new HashMap<Integer, Livro>();
    private Integer id = 0;

    public  void incluir(Livro livro){
        livro.setId(++id);

        mapa.put(livro.getId(), livro);
    }

    public Collection<Livro> obterLista(){
        return mapa.values();
    }
}

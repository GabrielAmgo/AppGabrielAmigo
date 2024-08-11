package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.model.Revista;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RevistaService {

    private Map<Integer, Revista> mapa = new HashMap<Integer, Revista>();
    private Integer id = 0;

    public  void incluir(Revista revista){
        revista.setId(++id);

        mapa.put(revista.getId(), revista);
    }

    public Collection<Revista> obterLista(){
        return mapa.values();
    }
}

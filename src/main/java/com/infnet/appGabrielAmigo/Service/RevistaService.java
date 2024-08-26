package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.Repository.RevistaRepository;
import com.infnet.appGabrielAmigo.model.Revista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RevistaService {

    @Autowired
    private RevistaRepository revistaRepository;



    public  void incluir(Revista revista){
        try {
            revistaRepository.save(revista);
        } catch (Exception e){
            System.err.println("[ERROR] " + e.getMessage());
        }
    }

    public Iterable<Revista> obterLista(){
        return revistaRepository.findAll();
    }
    public Revista obterPorId(int id){

        return  revistaRepository.findById(id).orElse(null);
    }
    public void excluirRevista(int id){

        revistaRepository.deleteById(id);
    }
    public long obterQtde() {
        return revistaRepository.count();
    }
}

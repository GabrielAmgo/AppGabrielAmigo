package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.Repository.LivroRepository;
import com.infnet.appGabrielAmigo.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public  void incluir(Livro livro){
        try {
            livroRepository.save(livro);
        } catch (Exception e){
            System.err.println("[ERROR] " + e.getMessage());
        }
    }

    public Iterable<Livro> obterLista(){
        return livroRepository.findAll();
    }

    public Livro obterLivroPorId(int id){
        return livroRepository.findById(id).orElse(null);}

    public void excluirLivro(int id){
        livroRepository.deleteById(id);
    }
    public long ObterQtde() {
        return livroRepository.count();
    }

}

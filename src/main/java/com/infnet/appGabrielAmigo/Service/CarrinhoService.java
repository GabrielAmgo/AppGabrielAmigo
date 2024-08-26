package com.infnet.appGabrielAmigo.Service;

import com.infnet.appGabrielAmigo.Repository.CarrinhoRepository;
import com.infnet.appGabrielAmigo.Repository.LivroRepository;
import com.infnet.appGabrielAmigo.model.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;
    @Autowired
    private LivroRepository livroRepository;

    public  void incluir(Carrinho carrinho){
        try {
            carrinhoRepository.save(carrinho);
        } catch (Exception e){
            System.err.println("[ERRO] " + e.getMessage());
        }
    }

    public Iterable<Carrinho> obterLista(){
        return carrinhoRepository.findAll();
    }

    public Carrinho obterPorId(int id) {
        return carrinhoRepository.findById(id).orElse(null);
    }

    public void excluirCarrinho(int id) {
        carrinhoRepository.deleteById(id);
    }

    public long obterQtde() {
        return carrinhoRepository.count();
    }
}

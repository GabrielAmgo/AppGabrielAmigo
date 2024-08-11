package com.infnet.appGabrielAmigo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Carrinho {
    private int codigo;
    private List<Produto> produtos = new ArrayList<>();
    private float valorTotal;

    public Carrinho(){
        produtos = new ArrayList<>();
    }

    public float calcularValorTotal() {
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "codigo=" + codigo +
                ", produtos=" + produtos +
                ", valorTotal=" + valorTotal +
                '}';
    }
}

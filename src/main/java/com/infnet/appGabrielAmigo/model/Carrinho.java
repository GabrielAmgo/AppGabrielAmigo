package com.infnet.appGabrielAmigo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TCarrinho")
@Data
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int codigo;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "idCarrinho")
    private List<Produto> produtos;
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

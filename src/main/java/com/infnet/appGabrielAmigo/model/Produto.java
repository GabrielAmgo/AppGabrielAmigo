 package com.infnet.appGabrielAmigo.model;

import com.infnet.appGabrielAmigo.model.Genero;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int codigo;
    private String nome;
    private Genero tipoGenero;
    private String autor;
    private float preco;
    private boolean ilustrado;
    @ManyToOne
    @JoinColumn(name = "idCarrinho")
    private Carrinho carrinho;

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", tipoGenero=" + tipoGenero +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                ", ilustrado= " + (ilustrado ? "sim" : "não") +
                '}';
    }
}

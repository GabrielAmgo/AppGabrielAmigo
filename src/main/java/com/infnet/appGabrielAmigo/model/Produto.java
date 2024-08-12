package com.infnet.appGabrielAmigo.model;

import com.infnet.appGabrielAmigo.model.Genero;
import lombok.Data;
import lombok.Getter;
@Data
public class Produto {

    private int id;
    private int codigo;
    private String nome;
    private Genero tipoGenero;
    private String autor;
    private float preco;
    private boolean ilustrado;

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

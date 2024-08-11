package com.infnet.appGabrielAmigo.model;

import lombok.Data;

@Data
public class Livro extends Produto {

    private int ISBN;
    private String editora;

    @Override
    public String toString() {
        return super.toString() + "ISBN=" + ISBN +
                ", editora='" + editora + '\'' +
                '}';
    }

}

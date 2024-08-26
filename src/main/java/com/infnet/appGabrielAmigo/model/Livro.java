package com.infnet.appGabrielAmigo.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "TLivro")
@Data
public class Livro extends Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ISBN;
    private String editora;

    @Override
    public String toString() {
        return super.toString() + "ISBN=" + ISBN +
                ", editora='" + editora + '\'' +
                '}';
    }

}

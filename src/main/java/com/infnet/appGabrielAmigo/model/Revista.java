package com.infnet.appGabrielAmigo.model;

import com.infnet.appGabrielAmigo.model.Periodicidade;
import com.infnet.appGabrielAmigo.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data

public class Revista extends Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private int ISSN;
    private Periodicidade tipoPeriodicidade;

    @Override
    public String toString() {
        return super.toString() + "ISSN: " + ISSN
                + " Periodicidade: " + tipoPeriodicidade;
    }
}

package com.infnet.appGabrielAmigo.model;

import com.infnet.appGabrielAmigo.model.Periodicidade;
import com.infnet.appGabrielAmigo.model.Produto;
import lombok.Data;

@Data

public class Revista extends Produto {
    private int ISSN;
    private Periodicidade tipoPeriodicidade;

    @Override
    public String toString() {
        return super.toString() + "ISSN: " + ISSN
                + " Periodicidade: " + tipoPeriodicidade;
    }
}

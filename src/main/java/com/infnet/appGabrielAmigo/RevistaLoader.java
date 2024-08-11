package com.infnet.appGabrielAmigo;

import com.infnet.appGabrielAmigo.Service.LivroService;
import com.infnet.appGabrielAmigo.Service.RevistaService;
import com.infnet.appGabrielAmigo.model.Genero;
import com.infnet.appGabrielAmigo.model.Periodicidade;
import com.infnet.appGabrielAmigo.model.Revista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class RevistaLoader implements ApplicationRunner {

    @Autowired
    private RevistaService revistaService;


    @Override
    public void run(ApplicationArguments args) throws Exception {



        FileReader file = new FileReader("files/Revistas.txt");
        BufferedReader leitura = new BufferedReader(file);


        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {

            campos = linha.split(";");


            Revista revista = new Revista();
            revista.setNome(campos[1]);
            revista.setAutor(campos[2]);
            revista.setTipoGenero(Genero.valueOf(campos[3]));
            revista.setPreco(Float.parseFloat(campos[4]));
            revista.setIlustrado(Boolean.parseBoolean(campos[5]));
            revista.setISSN(Integer.parseInt(campos[6]));
            revista.setTipoPeriodicidade(Periodicidade.valueOf(campos[7]));

            revistaService.incluir(revista);

            linha = leitura.readLine();
        }

        for (Revista r : revistaService.obterLista()) {
            System.out.println("Revista: " + r);
        }
    }
}

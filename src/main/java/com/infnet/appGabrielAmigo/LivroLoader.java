package com.infnet.appGabrielAmigo;

import com.infnet.appGabrielAmigo.Service.LivroService;
import com.infnet.appGabrielAmigo.model.Genero;
import com.infnet.appGabrielAmigo.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class LivroLoader implements ApplicationRunner {

    @Autowired
    private LivroService livroService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/Livros.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        while(linha != null) {

            campos = linha.split(";");

            Livro livro = new Livro();
            livro.setCodigo(Integer.parseInt(campos[0]));
            livro.setNome(campos[1]);
            livro.setAutor(campos[2]);
            livro.setTipoGenero(Genero.valueOf(campos[3]));
            livro.setISBN(Integer.parseInt(campos[4]));
            livro.setEditora(campos[5]);
            livro.setPreco(Float.parseFloat(campos[6]));

            livroService.incluir(livro);

            linha = leitura.readLine();
        }

        for (Livro a : livroService.obterLista()){
            System.out.println("Livro: " + a);
        }

        leitura.close();
    }
}

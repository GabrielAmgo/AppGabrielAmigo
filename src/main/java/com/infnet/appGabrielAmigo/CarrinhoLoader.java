package com.infnet.appGabrielAmigo;

import com.infnet.appGabrielAmigo.Service.CarrinhoService;
import com.infnet.appGabrielAmigo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class CarrinhoLoader implements ApplicationRunner {

    @Autowired
    private CarrinhoService carrinhoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/Carrinho.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        Carrinho carrinho = null;

        while(linha != null) {

            campos = linha.split(";");

            switch (campos[0].toUpperCase()) {
                case "C":
                    carrinho = new Carrinho();
                    carrinho.setCodigo(Integer.parseInt(campos[1]));

                    carrinhoService.incluir(carrinho);

                    break;

                case "L":
                    Livro livro = new Livro();
                    livro.setId(Integer.parseInt(campos[1]));
                    livro.setNome(campos[2]);
                    livro.setAutor(campos[3]);
                    livro.setTipoGenero(Genero.valueOf(campos[4]));
                    livro.setISBN(Integer.parseInt(campos[5]));
                    livro.setEditora(campos[6]);
                    livro.setPreco(Float.parseFloat(campos[7]));

                    carrinho.getProdutos().add(livro);

                    break;

                case "R":
                    Revista revista = new Revista();
                    revista.setId(Integer.parseInt(campos[1]));
                    revista.setNome(campos[2]);
                    revista.setAutor(campos[3]);
                    revista.setTipoGenero(Genero.valueOf(campos[4]));
                    revista.setPreco(Float.parseFloat(campos[5]));
                    revista.setIlustrado(Boolean.parseBoolean(campos[6]));
                    revista.setISSN(Integer.parseInt(campos[7]));
                    revista.setTipoPeriodicidade(Periodicidade.valueOf(campos[8]));

                    carrinho.getProdutos().add(revista);
                    break;

                default:
                    break;
            }

            linha = leitura.readLine();
        }

            for(Carrinho c: carrinhoService.obterLista()) {
                c.calcularValorTotal();
                System.out.println("Carrinho: " + c);
        }

        leitura.close();
    }
}


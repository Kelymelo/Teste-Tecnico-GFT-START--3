package com.dio.gft.acompanhamentoLeitura;

import com.dio.gft.acompanhamentoLeitura.classes.Leitor;
import com.dio.gft.acompanhamentoLeitura.classes.Livro;

import java.util.ArrayList;
import java.util.List;

public class MainLeitura {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>(){{
            add(new Livro("Para todos os garotos que já amei",100,0));
            add(new Livro("Antes de você",110,0));
            add(new Livro("Ainda sou eu",120,0));
            add(new Livro("Depois de você",150,0));
        }};

        Livro livroFavorito = new Livro("Depois de você",150,0);

        livros.add(livroFavorito);

        System.out.println("Livros: " + livros);

        Leitor leitor = new Leitor("Kely Oliveira",livroFavorito, livros);


        Livro livroF = new Livro("O sol nasce para todos",2010,0);

        leitor.adcionarLivro(livroF);

        System.out.println("Estante de Livros: " + leitor.getEstanteLivros());
    }
}

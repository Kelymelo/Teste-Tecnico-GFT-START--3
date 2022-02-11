package com.dio.gft.acompanhamentoLeitura.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Leitor {
    private String nome;
    Livro livroFavorito;
    List<Livro> estanteLivros;

    public void adcionarLivro(Livro livro){
        estanteLivros.add(livro);
    }

    public void removerLivro(Livro livro){
        livro.setPaginasLidas(0);
        estanteLivros.remove(livro);
    }


}

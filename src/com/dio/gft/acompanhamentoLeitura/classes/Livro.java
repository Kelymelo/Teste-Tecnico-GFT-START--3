package com.dio.gft.acompanhamentoLeitura.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public double verificarProgresso(){

        return Math.floor(paginasLidas * qtdPaginas / 100);
    }

    public int adicionarrPaginasLidas(){

        return paginasLidas++;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", paginasLidas=" + paginasLidas +
                '}';
    }
}

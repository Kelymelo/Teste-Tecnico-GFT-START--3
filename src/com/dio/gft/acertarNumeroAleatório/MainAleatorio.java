package com.dio.gft.acertarNumeroAleatório;

/*
Gere um número inteiro aleatório entre 0 e 10 a cada execução
do programa(Biblioteca Random tanto em Java como C#)
e pergunte ao usuário um número. Se o usuário errar,
peça para ele entrar com outro número
até que acerte o número gerado aleatoriamente.
 */

import java.util.Random;
import java.util.Scanner;

public class MainAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(10);

        System.out.println(numero);

        System.out.println("Digite o numero: ");
        int num = scan.nextInt();

         while (num != numero){

             System.out.println("Valor incorreto digite novamente: ");
             num = scan.nextInt();
         }












    }
}

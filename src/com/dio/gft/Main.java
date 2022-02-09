package com.dio.gft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer [] vet = {10,5,98,452};
        Integer [] vet1 = {10,5,98,452};
        System.out.println("O vetor multiplicado é: " + multiplicaArrays(vet,vet1) );

        Integer [] vet3 = {548,213,10};
        Integer [] vet4 = {5,21,12};
        System.out.println("O vetor multiplicado é: " + multiplicaArrays(vet,vet1) );

        Integer [] vet6 = {50,60,70};
        Integer [] vet7 = {5,21,12};
        System.out.println("O vetor multiplicado é: " + multiplicaArrays(vet,vet1) );

        Integer [] vet9 = {60,70};
        Integer [] veta = {1,2,3};
        System.out.println("O vetor multiplicado é: " + multiplicaArrays(vet,vet1) );

    }

    public static Integer[] multiplicaArrays(Integer[] a, Integer[] b){

        Integer [] vetFinal = new Integer[a.length];

        if (a.length == b.length){

            for (int i=0;i< a.length; i++){
                vetFinal[i] = a[i] * b[i];
            }
        }else{
            System.out.println("Vetores não tem o mesmo tamanho");
        }


        return vetFinal;


    }


}

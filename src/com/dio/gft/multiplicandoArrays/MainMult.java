package com.dio.gft.multiplicandoArrays;

import java.util.Scanner;

public class MainMult {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Integer [] vet = {10,5,98,452};
            Integer [] vet1 = {10,5,98,452};
            multiplicaArrays(vet,vet1);

            Integer [] vet3 = {548,213,10};
            Integer [] vet4 = {5,21,12};
            multiplicaArrays(vet3,vet4);

            Integer [] vet6 = {50,60,70};
            Integer [] vet7 = {5,21,12};
            multiplicaArrays(vet6,vet7);

            Integer [] vet9 = {60,70};
            Integer [] veta = {1,2,3};
            multiplicaArrays(vet9,veta);

        }

        public static void multiplicaArrays(Integer[] a, Integer[] b){

            Integer vetFinal = 0;

            if (a.length != b.length){
                throw new RuntimeException("Os vetores são de tamanho diferente");
            }

            for (int i=0;i< a.length; i++){
                vetFinal += a[i] * b[i];
            }

        System.out.println("O vetor final é: "+ vetFinal);


    }



}

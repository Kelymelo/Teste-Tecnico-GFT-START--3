package com.dio.gft.PersonagensRPG.classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float Xp;
    private int inteligencia;
    private int forca;
    private int level;


    public void lvlUp(){

    }
}

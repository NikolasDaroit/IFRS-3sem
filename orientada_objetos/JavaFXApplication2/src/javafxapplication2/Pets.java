/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Pets {
    public static ArrayList<Animal> bicharada =  new ArrayList<Animal>();
    
    public static void addBicho(Animal animal){
        bicharada.add(animal);
    }
    public static ArrayList<Animal> getBicho(){
        return bicharada;
    }
}
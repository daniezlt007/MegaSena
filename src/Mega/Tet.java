/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mega;

import java.util.Random;

/**
 *
 * @author Daniel
 */
public class Tet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a =  new int[50];
        int soma = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = (rand.nextInt(10000));
            if(a[i] % 2 == 0){
            System.out.println("Numero: " + a[i]);
            soma += 1;
            }
        }
        System.out.println("Quantos pares: " + soma);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_g6;

/**
 *
 * @author damon
 */
public class PotenciaCuadrado {
    public int getPotenciaCuadrado(int num){
        return num * num;
    }
    
    public float raiz2(float radicando){
        if(radicando<0){
            return 0;
        }
        float res= (float) Math.sqrt(radicando);
        return res;
    }
}

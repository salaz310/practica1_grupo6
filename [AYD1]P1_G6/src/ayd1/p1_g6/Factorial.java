/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_g6;

/**
 *
 * @author Sistemas
 */
public class Factorial {
    
    public int funcion_factorial(int numero){
    
        if(numero == 0){
            return 1;
        }else
            return numero * funcion_factorial(numero-1);

        }
    
}

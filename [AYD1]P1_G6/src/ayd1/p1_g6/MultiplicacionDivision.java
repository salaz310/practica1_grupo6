/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd1.p1_g6;

/**
 *
 * @author Mitchel Andrea
 */
public class MultiplicacionDivision {
    
    double primero;
    String signo;
    double segundo;
    
    public void operar1(double primero, String signo){
        this.primero=primero;
        this.signo=signo;        
        
    }
    
    public double operar2(double segundo){
        double resultado=0;
        this.segundo = segundo;
        if(this.signo.equals("*")){
            resultado= primero * segundo;
        }
        if(this.signo.equals("/")){
            resultado= primero / segundo;
        }
       return resultado;
    }
}

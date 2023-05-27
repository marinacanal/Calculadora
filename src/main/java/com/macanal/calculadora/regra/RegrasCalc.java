/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.macanal.calculadora.regra;

/**
 *
 * @author marina.canal
 */
public class RegrasCalc {
    
    public String Calcular (double num1, char operador, double num2) {
        double resultado = 0.0;
        
        if(operador == '+') {
            resultado = num1 + num2;
        }
        
        else if (operador == '-') {
            resultado = num1 - num2;
        }
        
        else if (operador == '/') {
            resultado = num1 / num2;
        }
        
        else if (operador == '*') {
            resultado = num1 * num2;
        }
        
        
        return String.valueOf(resultado);
        
    }
}

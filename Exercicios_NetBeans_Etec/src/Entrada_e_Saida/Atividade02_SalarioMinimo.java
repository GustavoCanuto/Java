/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrada_e_Saida;

import java.util.Scanner;

public class Atividade02_SalarioMinimo {
    
        public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double salario,salarioMin,qtdSalarioMin;
        
        salarioMin = 1380.60f;
        
        System.out.println("Insira seu salário");
        salario = leitor.nextFloat();
       
        qtdSalarioMin = salario/salarioMin;
        
        
       System.out.println("Você recebe: " + String.format("%.1f",qtdSalarioMin) + " Salários mínimo");
        
        }
    
}

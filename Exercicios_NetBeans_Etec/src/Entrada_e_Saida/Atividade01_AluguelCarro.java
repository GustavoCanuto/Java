/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entrada_e_Saida;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Atividade01_AluguelCarro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        //Variavel modelo so carro alugado
        String modeloCarro;
        // Valor da diaria para locação 
        float valorDiaria;
        //quantidade de dias
        int qtdDias;
        // Quantidade km percorridos
        float km;
        //preço total a pagar
        double total; 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o modelo do carro");
        modeloCarro = leitor.next();
        System.out.println("Insira o valor da di�ria para loca��o");
        valorDiaria = leitor.nextFloat();
        System.out.println("Insira a quantidade de dias de loca��o");
        qtdDias = leitor.nextInt();
        System.out.println("Insira a quantidade de Km percorridos");
        km = leitor.nextFloat();
        
        total = (km*0.20)+ qtdDias*valorDiaria;
        
        System.out.println("O modelo do seu carro �: " +modeloCarro +
               " e o total a pagar �: " +total);
    }
    
}

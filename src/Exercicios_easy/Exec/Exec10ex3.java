package Exercicios_easy.Exec;

import javax.swing.*;

                               //Juros Simples com Enquanto
public class Exec10ex3 {
    public static void main(String[] args) {
        double investimento, taxa = 0.05, valorJuros = 0, valorTotal=0,i=1;
        investimento = Integer.parseInt(JOptionPane.showInputDialog("Digitar valor"));
        while (i <=10){//Abertura do metodo ( ENQUANDO )
        valorJuros = investimento * taxa + valorJuros;
        i++; // Origem i=i+1
    }//Fechamento do metodo ( ENQUANDO )
        System.out.println("Valor juros: " + valorJuros);
        JOptionPane.showMessageDialog(null, valorJuros, "Valor do juros", 1);
        System.out.println("Valor investido: " + investimento);
        JOptionPane.showMessageDialog(null, investimento, "Valor investido", 1);
        System.out.println("Valor totoal do investimento: " + (investimento+valorJuros));
        JOptionPane.showMessageDialog(null, investimento + valorJuros, "Valor total", 1);
    }//Fechamento do metodo main.
}//Fechamenrto da classe.

//Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0, valorTotal=0;i=1;
//Investimento = Ler(1000);
//Enquanto(i<=10)
//valorJuros = investimento*taxa+valorJuros
//i =i+1;
//fim enquanto
//exibir(“Valor juros: ” + valorJuros);
//exibir(“Valor investido: ” + investimento);
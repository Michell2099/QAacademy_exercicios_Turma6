package Exercicios_easy.Exec;

import javax.swing.*;

                                             //Juros Compostos

public class Exec10ex2 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
        double investimento, taxa=0.05,valorJuros=0,valorTotal=0,i=1;
        investimento = Integer.parseInt(JOptionPane.showInputDialog("Digitar valor"));
        while (i<=10) {//Abertura do metodo ( ENQUANDO )
            valorJuros = ((investimento + valorJuros) * taxa) + valorJuros;
            i++; // Origem i=i+1
        }//Fechamento do metodo ( ENQUANDO )
        System.out.println("Valor juros:" + valorJuros);
        JOptionPane.showMessageDialog(null, valorJuros, "Valor do juros", 1);
        System.out.println("Valor investido: " + investimento);
        JOptionPane.showMessageDialog(null, investimento, "Valor investido", 1);
        System.out.println("Valor total: " + investimento+valorJuros);
        JOptionPane.showMessageDialog(null, investimento + valorTotal, "Valor total", 1);
        }//Fechamento do metodo main.
    }//Fechamento da classe.

//Inicio Algoritmo
//Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0, valorTotal=0;i=1;
//Investimento = Ler(1000);
//Enquanto(i<=10)
//valorJuros = ((investimento+valorJuros)*taxa)+valorJuros
//i =i+1;
//fim enquanto
//exibir(“Valor juros: ” + valorJuros);
//exibir(“Valor investido: ” + investimento);
//exibir(“Valor total: ” + investimento+valorJuros);
//Fim Algoritmo
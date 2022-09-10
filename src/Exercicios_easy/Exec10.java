package Exercicios_easy;

import javax.swing.*;

        //10-)Faça um algoritmo para ler um valor de investimento, com uma taxa de juros
     //   de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros e o
      //  total com juros. Considerando que a remuneração será no regime de juros simples.

                            //Juros Simples sem utilizar o enquanto:

public class Exec10 {//Abertura dpa classe.
    public static void main(String[] args) {//Abertura do metodo main.
        int ValorInvestimeto;double taxaJuros = 0.05,ValorJuros,Valortotal;
        ValorInvestimeto = Integer.parseInt(JOptionPane.showInputDialog("Digitar valor"));
        taxaJuros=0.05*10;
        ValorJuros=ValorInvestimeto*taxaJuros;
        Valortotal=ValorJuros+ValorInvestimeto;
        //System.out.println(" Voce investiu:" + ValorInvestimeto);
        JOptionPane.showMessageDialog(null, " Voce investiu: " + ValorInvestimeto);
        //System.out.println("Rendeu:" + ValorJuros + " de juros ");
        JOptionPane.showMessageDialog(null, " Rendeu:" + ValorJuros + " de juros");
        //System.out.println("Valor total são:" + Valortotal);
        JOptionPane.showMessageDialog(null, " Valor total são:" + Valortotal);
    }//Fechamento do metodo main.
}//Fechamento da classe

//Declarar Variavel do tipo numerica: valorInvestimento, taxaJuros = 0.05, valorJuros, valorTotal;
//valorInvestimento = Ler (1000,00);
//taxajuros = 0.05 * 10; //0.50 ou 50%
//valorJuros = valorInvestimento * taxajuros;
//500,00. valorTotal = valorTotal = valorJuros+valorInvestimento;
//Exibir: “Você investiu: ”+valorInvestimento;
//Exibir: “Rendeu : ”+valorJuros + “de Juros”;
//Exibir: “O Valor total são : ”+valorTotal;
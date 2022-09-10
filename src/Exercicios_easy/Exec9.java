package Exercicios_easy;

import javax.swing.*;

                  //9-)Faça um algoritmo para ler um número inteiro entre: 1 e 10,
       // calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
public class Exec9 {//Abertura da classe.

                      public static void main(String[] args) {//Abertura do metodo main.
                          int i = 1, nun1;
                          nun1 = Integer.parseInt(JOptionPane.showInputDialog("Digitar valor"));
                          while (i <= 10) {//Abertura do metodo ( ENQUANDO )
                              System.out.println(nun1 + " x " + i + " = " + nun1 * i);
                              i++; // siginifica i=i+1
                          }//Fechamento do metodo ( ENQUANDO )
                      }//Fechamento do metodo main.
                  }//Fechamento da classe

//Inicio Algoritmo
//	Declarar variável do tipo numérico: numeroDigitado,  i = 1;
//	numeroDigitado = Ler(5);
//	Enquanto(i<=10)
//  Exibir: “Numero ”+numeroDigitado + “ x ”+ i +“ = ” + numeroDigitado * i;
//	i=i+1;
//	Fim Enquanto
//Fim Algoritmo
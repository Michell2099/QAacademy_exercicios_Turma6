package Exercicios_medium;

         //5-)  Faça um algoritmo para ler 5 números, verificar e
            //exibir, quais dos 5 números digitados, é o menor.

import javax.swing.*;

public class Exec5 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
         int i=1, antenrior=0, numeroDigitado;
         while (i<=5){//Abertura do metodo ( ENQUANDO ).
         numeroDigitado=Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro"));
         if (numeroDigitado < antenrior || i==1){
             antenrior=numeroDigitado;
         }
         i++;
         }//fechamento do metodo ( ENQUANDO ).]
        System.out.println("O menor digitado é:" + antenrior);
        JOptionPane.showMessageDialog(null,+ antenrior, "O menor digitado é:", 3);
    }//Fechamento do metodo main.
}//Fechamento da classe.

//Declarar variável numérica: i = 1, anterior,
//numeroDigitado;
//Enquanto(i<=5)
//numeroDigitado = Ler();
//Se(numeroDigitado < anterior || i==1)
//anterior = numeroDigitado;
//Fim Se
//i++;
//Fim Enquanto
//Exibir (“O menor digitado é: ”+anterior);
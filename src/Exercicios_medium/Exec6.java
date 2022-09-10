package Exercicios_medium;

               //6-) Faça um algoritmo para ler um número inteiro, calcular e exibir o
     //   Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800

import javax.swing.*;

public class Exec6 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
        int fatorial, i=0;
       fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        i=fatorial;
        while (i>1){//Abertura do metodo ( ENQUANDO ).
            fatorial=fatorial*(i-1);
           // System.out.println("O menor digitado é:" + fatorial);
            //JOptionPane.showMessageDialog(null,+ fatorial, "O menor digitado é:", 3);
            i--;
        }//Fechamenrto do metodo ( ENQUANDO ).
        System.out.println("O menor digitado é:" + fatorial);
    }//Fechamento do metodo main.
}//Fechamento da classe.

//Declarar variável do tipo inteiro: fatorial, i;
//fatorial  = Ler(“10”);
//i =  fatorial ;
//Enquanto(i>1)
//fatorial = fatorial * (i-1);
//i--;
//Fim Enquanto
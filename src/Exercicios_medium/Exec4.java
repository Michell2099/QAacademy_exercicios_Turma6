package Exercicios_medium;

          //4-)  Faça um algoritmo para calcular e exibir a multiplicação de todos os
          //números de 1 a 1000. E toda vez que resultado chegar ou ultrapassar 1000,
          //faça que o resultado das multiplicações volte a ser 1.

import javax.swing.*;

public class Exec4 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
     int i=1, multi=1;
     while (i<=1000){//Abertura do metodo ( ENQUANDO ).
         multi=i*multi;
     if (multi>=1000)
         multi = 1;
         System.out.println("Exibir:" + multi);
        // JOptionPane.showMessageDialog(null, "Exibir:" + multi);
         i++;
     }//fechamento do metodo ( ENQUANDO ).
     }//Fechamento da abertura do main.
}//Fechamento da classe.

//Declarar variável do tipo numerico: i=1, multi = 1;
//Enquanto(i<=1000 )
//multi = i* multi;
//Se(multi >= 1000)
//multi = 1;
//Fim Se
//Exibir(multi);
//i++; //i = i+1;
//Fim Enquanto
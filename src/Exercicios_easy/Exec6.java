package Exercicios_easy;

import javax.swing.*;

              //6-) Faça um algoritmo para ler duas notas, calcular a média.
       // E SE - a média > 5 Exibir aprovado;SE a média < que 5 exibir reprovado;
       //Se media = 5 exibir exame.

public class Exec6 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do main.
        int nota1, nota2, media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        media = (nota1 + nota2) / 2;
        if (media > 5) {//Abertura if
            //  System.out.println("Aprovado");
            JOptionPane.showMessageDialog(null,nota1, "Aprovado", 3);
        }// Fechamenrto if
        if (media < 5) {//Abertura if
            // System.out.println("Reprovado");
            JOptionPane.showMessageDialog(null,nota2, "Reprovado", 1);
        }// Fechamenrto if
        if (media == 5) {//Abertura if
            //System.out.println("Exame");
            JOptionPane.showMessageDialog(null,media, "exame", 2);
        }// Fechamenrto if
    }//Fechamento do medoto main.
}//Feschamen

   /// public static void main(String[] args) {//Abertura do main.
     //   int nota1, nota2, media;
       // nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
       // nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
      //  media = (nota1 + nota2) / 2;
      //  if (media > 5) {//Abertura if
    //  /    //  System.out.println("Aprovado");
     //       JOptionPane.showMessageDialog(null,nota1, "Aprovado", 3);
     //   }// Fechamenrto if
     //   if (media < 5) {//Abertura if
         //  // System.out.println("Reprovado");
           // JOptionPane.showMessageDialog(null,nota2, "Reprovado", 1);
//        if (media == 5) {//Abertura if
            //System.out.println("Exame");
           // JOptionPane.showMessageDialog(null,media, "exame", 2);
        //}// Fechamenrto if
   // }//Fechamento do medoto main.
//}//Feschamento do classe


//Inicio Algoritmo
//Declarar variaveis do tipo numerico: nota1, nota2, media;
//nota1 = ler(5);
//nota2 = ler(6);
//media = (nota1+nota2) /2;
//Se(media > 5)
//  	  Exibir: “Aprovado”;
//Fim Se
//Se(media < 5)
// 	  Exibir: “Reprovado”;
//Fim Se
//Se(media == 5)
// 	  Exibir: “Exame”;
//Fim Se
//Fim Algoritmo
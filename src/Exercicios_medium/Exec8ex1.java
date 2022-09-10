package Exercicios_medium;

//7-) Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.

import javax.swing.*;

public class Exec8ex1 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
       String vetorMeses[];
        int num;
        vetorMeses= new String[12];
        vetorMeses[0] = " Janeiro ";
        vetorMeses[1] = " Fevereiro ";
        vetorMeses[2] = " Março ";
        vetorMeses[3] = " Abril ";
        vetorMeses[4] = " Maio ";
        vetorMeses[5] = " Junho ";
        vetorMeses[6] = " Julho ";
        vetorMeses[7] = " Agosto ";
        vetorMeses[8] = " Setembro ";
        vetorMeses[9] = " Outubro ";
        vetorMeses[10] = " Novembro ";
        vetorMeses[11] = " Dezembro ";
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
             System.out.println(" O mes é: " + vetorMeses[num-1]);
        JOptionPane.showMessageDialog(null,vetorMeses[num-1], "Chaxe PIX", 3);
            //i++;
        // Fechamento do metodo ( ENQUANDO ).
    }//Fechamento do metodo main.
}//Fechamento da classe.

//Iniciar Algoritmo
//Declarar vetor do tipo texto: vetorMeses[12];
//Declaração em java:
//String [] vetorMeses;//declaração do array
//vetorMeses = new String[12];
//vetorMeses[0] = “Janeiro”;
//vetorMeses[1] = “Fevereiro”;
//vetorMeses[2] = “Março”;
//vetorMeses[10] = “Novembro”;
//vetorMeses[11] = “Dezembro”;
//Fim Algoritmo

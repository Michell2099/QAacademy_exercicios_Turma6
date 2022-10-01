package Exercicios_easy;

import javax.swing.*;

          //5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis,
     //   e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

public class Exec5 {

    public int Soma(int nun1, int nun2, int nun3){
        return nun1 + nun2 + nun3;
    }
    public int Subtração(int nun1, int nun2, int nun3){
        return nun1 - nun2 - nun3;
    }
    public int Multiplicação(int nun1, int nun2, int nun3){
        return nun1 * nun2 * nun3;
    }
    public int minhaMedia( int nun1, int nun2, int nun3){
        int soma = nun1+nun2+nun3;
        return soma/3;
    }

}    //Fechamento metodo main.
    //public static void main(String[] args) {//Abertura do metodo main.
       // int nun1,nun2,nun3;
       // nun1=Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro"));
       // nun2=Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo"));
       // nun3=Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro"));
       // int soma,subtração,multiplicação,media;
       // soma=nun1+nun2+nun3;
       // System.out.println("Minha soma é:" + soma);
       // subtração=nun1-nun2-nun3;
       // System.out.println("Minha subtração é:" + subtração);
       // multiplicação=nun1*nun2*nun3;
     //   System.out.println("Minha multiplicação é" + multiplicação);
        //media=soma/3;
     //   System.out.println("Minha media é:" + soma/3);
  //  }//Fechamento metodo main.
//}//Fechamento da classe.}

//Inicio Algoritmo
//Declarar variáveis numéricas: numero1, numero2 e numero3;
//Declarar variáveis numéricas: soma, subtração, multiplicação, media;
//numero1 = Ler(10);
//numero2 = Ler(20);
//numero3 = Ler(30);
//soma = numero1 + numero2 + numero3;
//subtracao = numero1 - numero2 - numero3;
//multiplicacao = numero1 * numero2 * numero3;
//media = soma / 3;
//Exibir: “A soma dos números digitados é: ”+soma;
//Exibir:  “A subtração dos números digitados é: ”+ subtração;
//Exibir:  “A multiplicacaodos números digitados é: ” +multiplicacao;
//Exibir: “A  media dos números digitados é: ” +media;
//Fim Algoritmo
package Exercicios_easy.Exec;

import javax.swing.*;

                                             //Juros Compostos

public class Exec10ex2 {
    public String calInvestimento(double investimento) {
        double taxa=0.05,valorJuros=0;
        int i =1;
        while (i<=10) {
            valorJuros = ((investimento + valorJuros) * taxa) + valorJuros;
            i++;
        }
       return "Valor juros:"+valorJuros +"\n "+"Valor investido:"+investimento+"\n "+"Valor total:"+(investimento+valorJuros);
    }
}

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
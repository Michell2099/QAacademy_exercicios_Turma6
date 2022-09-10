package Exercicios_medium;

//7-) Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.

public class Exec8 {//Abertura da classe.
    public static void main(String[] args) {//Abertura do metodo main.
        String vetorMeses[];
        int i=0;
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
        while (i<=11)
        {//Abertura do ( ENQUANRTO)
            System.out.printf("%0,2d- %s\n", (i+1), vetorMeses[i]);
            i++;
        }//Fechamento do metodo ( ENQUANDO ).
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

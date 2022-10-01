package Exercicios_medium;

      //3-) Faça um algoritmo para calcular e exibir a soma de todos os números
       // de 0 a 1000. E parar se caso a soma atingir 1500(Ou mais).
        //EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar

public class Exec3 {
    public void ExibirSoma(int i) {
        int soma = 0;
        while (i <= 100) {
            soma = i + soma;
            if (soma >= 1500)
                break;
            System.out.println("Exibir:" + soma);
            i++;
        }
    }
}













   // public static void main(String[] args) {//Abertura do metodo main.
        //int i = 0, soma = 0;//Variaveis.
        ///while (i <= 100) {//Abertura do metodo ( ENQUANDO ).
            //soma = i + soma;
            //if (soma >= 1500)
           //     break;// Significa ( Pausa ).
       // System.out.println("Exibir:" + soma);
       // i++;// siginifica i=i+1
   // }//Fechamento do metodo ( ENQUANDO ).
    //}//Fechamento do metodo main.
//}//Fechamento da classe.

//Inicio Algoritmo
//Declarar variável do tipo numerico: i=0, soma;
//Enquanto(i<=1000 )
//soma = i+soma;
//Se(soma>= 1500)
//break; //parar
//Fim Se
//Exibir(soma);
//	i++; //i = i+1;
//	Fim Enquanto
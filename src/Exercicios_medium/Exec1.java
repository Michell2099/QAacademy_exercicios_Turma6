package Exercicios_medium;

                //Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
                //números Pares e ímpares.

public class Exec1 {
    public void ExibirparImpar() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0){
                System.out.println("O numero é:" + i + " par ");
            }
            else{
                System.out.println("O numero é:" + i + " Impar ");
            }
            i++;
        }
    }
}





    //public static void main(String[] args) {//Fechamento do metodo main.
       // int i = 0;
      ////  while (i <= 100) {//Abertura do metodo ( ENQUANDO )
           // if (i % 2 == 0){//Abertura if
             //   System.out.println("O numero é:" + i + " par ");
      //  }//Fechamento if
        //    else{//Abertura da segunda condição do if ( else )
         //       System.out.println("O numero é:" + i + " Impar ");
          //  }//Fechamento da segunda condição do if ( else )
          //  i++;    //O siginifica i=i+1
       // }//Fechamento do metodo ( ENQUANDO )
  //  }//Fechamento do metodo main.
//}//Fechamento da classe.
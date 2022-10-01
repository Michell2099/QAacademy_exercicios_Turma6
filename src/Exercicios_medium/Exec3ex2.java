package Exercicios_medium;
         //3-) Faça um algoritmo para calcular e exibir a soma de todos os números
         // de 0 a 1000. E parar se caso a soma atingir 1500(Ou mais).
          //EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar


public class Exec3ex2 {
    public void ExibirSoma(int i) {
        int soma=1;
        while (i<=1000 && soma <=1500){
            soma = i+soma;
            System.out.println("Exibir:" + soma);
            i++;
        }
    }
}












   // public static void main(String[] args) {//Abertura do metodo main.
       //int i=0, soma=1;
       // while (i<=1000 && soma <=1500){//Abertura do metodo ( ENQUANDO ).
            //soma = i+soma;
           // System.out.println("Exibir:" + soma);
           // JOptionPane.showMessageDialog(null, "Exibir:" + soma);
          //  i++;// siginifica i=i+1
      //  }////Fechamento do metodo ( ENQUANDO ).
  //  }//Fechamento do metodo main.
//}//Feechamento da classe.

//Sem o break.
//Inicio Algoritmo


//Declarar variável do tipo numerico: i=0, soma;
//Enquanto(i<=1000 && soma <=1500)
//soma = i+soma;
//Exibir(soma);
//i++; //i = i+1;
//Fim Enquanto

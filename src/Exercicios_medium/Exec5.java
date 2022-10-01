package Exercicios_medium;

         //5-)  Faça um algoritmo para ler 5 números, verificar e
            //exibir, quais dos 5 números digitados, é o menor.

public class Exec5 {//Abertura da classe.

    public void ExibirNumeroMenor(int nun1, int nun2, int nun3, int nun4, int nun5) {

        int antenrior = nun1;
        int i = 1;

            if (antenrior > nun2) {
            antenrior = nun2;
            }
            if (antenrior > nun3) {
            antenrior = nun3;
            }
            if (antenrior > nun4) {
                antenrior = nun4;
            }
            if (antenrior > nun5) {
                antenrior = nun5;
            }
        System.out.println("O menor digitado é: " + antenrior);

        }
    }



   // public static void main(String[] args) {//Abertura do metodo main.
         //int i=1, antenrior=0, numeroDigitado;
        // while (i<=5){//Abertura do metodo ( ENQUANDO ).
         //numeroDigitado=Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro"));
         //if (numeroDigitado < antenrior || i==1){
        //     antenrior=numeroDigitado;
       //  }
       //  i++;
       //  }//fechamento do metodo ( ENQUANDO ).]
       // System.out.println("O menor digitado é:" + antenrior);
       // JOptionPane.showMessageDialog(null,+ antenrior, "O menor digitado é:", 3);
   // }//Fechamento do metodo main.
//}//Fechamento da classe.

//Declarar variável numérica: i = 1, anterior,
//numeroDigitado;
//Enquanto(i<=5)
//numeroDigitado = Ler();
//Se(numeroDigitado < anterior || i==1)
//anterior = numeroDigitado;
//Fim Se
//i++;
//Fim Enquanto
//Exibir (“O menor digitado é: ”+anterior);
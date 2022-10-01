package Exercicios_easy;

//   7-) Faça um algoritmo para ler um valor de salário, calcular
       // e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo:

public class Exec7 {
    public String CalcularInss(double salario){
        double inss=0;
        if (salario <= 1045.00){
            inss = salario * 0.075;
            return " O valor a receber é "  + inss;
        }
        if (salario >= 1045.01 && salario <= 2089.60){
            inss = salario * 0.09;
            return " O valor a receber é "  + inss;
        }
        if (salario >= 2089.61 && salario <= 3134.40){
            inss = salario * 0.12;
            return " O valor a receber é "  + inss;
        }
        if (salario >= 3134.41){
            inss = salario * 0.14;
            return " O valor a receber é "  + inss;

        }
        return null;
    }
}








          //  public static void main(String[] args) {// Abertura do metodo main.

             //   double salario, inss;
             //   salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
            //    if (salario <= 1045.00){//Abertura if
             //       inss = salario * 0.075;
             //       System.out.println("O valor a receber sera:" + inss);
                   // JOptionPane.showMessageDialog(null,inss, "O inss a receber", 2);
                 //   }// Fechamenrto if
                    //if (salario >= 1045.01 && salario <= 2089.60){//Abertura if
                      //  inss = salario * 0.09;
                     //   System.out.println("O valor a receber sera:" + inss);
                    //    JOptionPane.showMessageDialog(null,inss, "O inss a receber", 1);
                  //  }// Fechamenrto if
                 //   if (salario >= 2089.61 && salario <= 3134.40){//Abertura if
                 //       inss = salario * 0.12;
                //        System.out.println("O valor a receber sera:" + inss);
                       // JOptionPane.showMessageDialog(null,inss, "O inss a receber", 3);
                   // }// Fechamenrto if
                  //  if (salario >= 3134.41){//Abertura if
                      //  inss = salario * 0.14;
                       // System.out.println("O valor a receber sera:" + inss);
                      //  JOptionPane.showMessageDialog(null,inss, "O inss a receber", 1);
                   // }// Fechamenrto if
         //  }//Fechamento do medoto main.
//}//Feschamento do classe}


//Inicio Algoritmo
//	Declarar variável do numérico: salario, inss;
//	salario = Ler(1045);
//	SE(salario <= 1045.00)
//		inss = salario  * 0.075;
//		Exibir: (“O Valor que você de inss será: ”+ inss);
//	Fim se
//	SE(salario >= 1045.01 && salario<= 2089,60)
// 	inss = salario  * 0.09;
//		Exibir: (“ O valor de Inss será: ”+ inss);
//	Fim se
//SE(salario >= 2089,61 && salario<=3134.40)
// 	inss = salario  * 0,12;
//		Exibir: (“O valor de Inss será: ”+ inss);
//	Fim se
//SE(salario >= 3134.41)
//inss = salario  * 0.14;
//		Exibir: (“O Valor que você de inss será: ”+ inss);
//	Fim Se
//Fim Algoritmo

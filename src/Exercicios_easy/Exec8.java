package Exercicios_easy;

import javax.swing.*;

//8-) Faça um algoritmo para ler um valor de salário, calcular e exibir o
       ///valor do salário bruto, valor do salário líquido e o valor do
          //  imposto de renda. Respeitando a tabela abaixo:

public class Exec8 {//Inicio da classe.

    public String exibirInss(double salario) {
        double inss = 0;
        if (salario > 0 && salario <= 1903.98) {
            inss = (salario * 0.075) - 142.80;
            return "Insento";
        }
        else {
            if (salario >= 2826.66 && salario <= 3751.05) {
                inss = (salario * 0.15) - 354.80;
                String s = " ";
                return " %0,2d- %s\n " + " O seu salario vai ser: " + salario +
                        " %0,2d- %s\n  " + " O seu salario - ir vai ser: " + (salario - inss) +
                        " %0,2d- %s\n  " + " O seu imposto a pagar é: " + inss;
            }
            if (salario >= 3751.06 && salario <= 4664.68) {
                inss = (salario * 0.225) - 636.13;
                return " %0,2d- %s\n " + " O seu salario vai ser: " + salario +
                        " %0,2d- %s\n  " + " O seu salario - ir vai ser: " + (salario - inss) +
                        " %0,2d- %s\n  " + " O seu imposto a pagar é: " + inss;
            }
            if (salario > 4664.68) {
                inss = (salario * 0.275) - 869.36;
                return " \n " + " O seu salario vai ser: " + salario +
                        " \n  " + " O seu salario - ir vai ser: " + (salario - inss) +
                        " \n  " + " O seu imposto a pagar é: " + inss;
            }
            return null;
        }
    }
}
//JOptionPane.showMessageDialog(null, " O seu salario vai ser: " + salario);
///JOptionPane.showMessageDialog(null, " O seu salario - ir vai ser: " +(salario-inss));
//JOptionPane.showMessageDialog(null, " O seu imposto a pagar é: "+ inss);


  //  public static void main(String[] args) {////Abertura do medoto main.
       // double salario, inss = 0;
       // salario = Double.parseDouble(JOptionPane.showInputDialog("Digitar valor"));
        //if (salario > 0 && salario <= 1903.98) {//Abertura if ( SE ).
            // System.out.println("Isento");
            //JOptionPane.showMessageDialog(null, "isento");
           // inss = (salario * 0.075) - 142.80;
       // }// Fechamenrto if
        //else {//Abertura da segunda condição do if ( else - SE/NÃO )
           // if (salario >= 2826.66 && salario <= 3751.05)
              //  inss = (salario * 0.15) - 354.80;
           // if (salario >= 3751.06 && salario <= 4664.68)
               // inss = (salario * 0.225) - 636.13;
            ///if (salario > 4664.68)
               // inss = (salario * 0.275) - 869.36;
            //  System.out.println("Salario Bruto:" + salario);
            //  System.out.println("Salario liquido:" + (salario - ir));
            // System.out.println("Imposto a pagar:" + ir);
            //JOptionPane.showMessageDialog(null, " O seu salario vai ser: " + salario);
            ///JOptionPane.showMessageDialog(null, " O seu salario - ir vai ser: " +(salario-inss));
            //JOptionPane.showMessageDialog(null, " O seu imposto a pagar é: "+ inss);
        //}//Fechamento da segunda condição do if ( else )
   // }//Fechamento metodo main.
//}//Fechame



    //public static void main(String[] args) {////Abertura do medoto main.
        //double salario, inss = 0;
       // salario = Double.parseDouble(JOptionPane.showInputDialog("Digitar valor"));
       // if (salario > 0 && salario <= 1903.98) {//Abertura if ( SE ).
           // System.out.println("Isento");
            //JOptionPane.showMessageDialog(null, "isento");
            //inss = (salario * 0.075) - 142.80;
        //}// Fechamenrto if
        //else//{//Abertura da segunda condição do if ( else - SE/NÃO )
           // if (salario >= 2826.66 && salario <= 3751.05)
                //inss = (salario * 0.15) - 354.80;
           // if (salario >= 3751.06 && salario <= 4664.68)
                //inss = (salario * 0.225) - 636.13;
          //  if //(salario > 4664.68)
               // inss = (salario * 0.275) - 869.36;
            //  System.out.println("Salario Bruto:" + salario);
          //  System.out.println("Salario liquido:" + (salario - ir));
          // System.out.println("Imposto a pagar:" + ir);
           // JOptionPane.showMessageDialog(null, " O seu salario vai ser: " + salario);
          //  JOptionPane.showMessageDialog(null, " O seu salario - ir vai ser: " +(salario-inss));
            //JOptionPane.showMessageDialog(null, " O seu imposto a pagar é: "+ inss);
       /// }//Fechamento da segunda condição do if ( else )
    //}//Fechamento metodo main.
//}//Fechamento da classe.


//Declarar variavel do tipo numerica: salario, ir;
//salario = Ler(5000,00);
//SE(salario > 0 && salario <= 1903,98 )
//	Exibir: (“Isento de imposto de renda”);
//Fim Se
//SE(salario >= 1903,99 && salario <= 2826,65)
//	ir = (salario * 0,075) - 142,80;
//Fim Se
//
//SE(salario >=2826,66 && salario <= 3751,05)
//ir = (salario * 0,15) - 354,80;
//Fim Se
//SE(salario >=3751,06 && salario <= 4664,68)
//ir = (salario * 0,225) - 636,13;
//Fim Se
//SE(salario > 4664,68)
//ir = (salario * 0,275) - 869,36;
//Fim Se
//Exibir“Salario Bruto: ” + salario;
//Exibir“Salario Liquido: ” + (salario - ir);
//Exibir“Imposto a pagar: ” +  i);
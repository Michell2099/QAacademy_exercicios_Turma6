package Exercicios_medium;

              //2-) Faça um algoritmo para ler um valor de investimento, com uma taxa de juros
             // de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros,
             // e o total. Considerando que a remuneração será no regime de juros compostos.

public class Exec2 {

     public Object ExibirJuros(double valorInvestimento) {
          double taxaJuros = 0.05, valorJuros = 0, valorTotal = 0;
          int i = 1;
          valorTotal = valorInvestimento;
          while (i <= 10) {
              i++;
}
               valorJuros = valorTotal + valorInvestimento;
               System.out.println("Voce investiu:" + valorInvestimento);
               System.out.println("Rendeu:" + valorJuros);
               System.out.println("O valor total:" + (valorInvestimento + valorJuros));
          return null;
     }
}














 //  public static void main(String[] args) {//Abertura do metodo main.
//double valorInvestimento,taxaJuros=0.05,valorJuros=0,valorTotal;
       // int i=1;
//valorInvestimento= Double.parseDouble(JOptionPane.showInputDialog("Digitar valor"));
//valorTotal = valorInvestimento;
//while (i<=10){//Abertura do metodo ( ENQUANDO )
    //valorTotal=((valorJuros*valorInvestimento)*taxaJuros)+valorJuros;
    //i++;
//}//Fechamento do metodo ( ENQUANDO )
//valorJuros=valorTotal+valorInvestimento;
        // //System.out.println("Voce investiu:" +valorInvestimento);
        // System.out.println("Rendeu:" + valorJuros + " de juros");
        // System.out.println("O valor total:" + valorTotal);
       // JOptionPane.showMessageDialog(null, " Voce investiu: " + valorInvestimento);
        //JOptionPane.showMessageDialog(null, " Rendeu: " + valorJuros + " de juros");
        //JOptionPane.showMessageDialog(null, " O Valor totol são: " + valorTotal );
    //}// Fechamento do metodo main.
//}//Fechamento da classe.


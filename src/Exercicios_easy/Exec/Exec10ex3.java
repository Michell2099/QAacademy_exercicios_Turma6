package Exercicios_easy.Exec;

//Juros Simples com Enquanto
public class Exec10ex3 {
    public String CalcularInvestimento (double investimento) {
        double taxa = 0.05, valorJuros = 0, valorTotal = 0, i = 1;
        while (i <= 10) {
            valorJuros = investimento * taxa + valorJuros;
            i++;
        }
        return "Valor juros:" + valorJuros + "\n " + "Valor investido:" + investimento;
    }
}

//Declarar variáveis tipo numero: investimento, taxa =0,05, valorJuros=0, valorTotal=0;i=1;
//Investimento = Ler(1000);
//Enquanto(i<=10)
//valorJuros = investimento*taxa+valorJuros
//i =i+1;
//fim enquanto
//exibir(“Valor juros: ” + valorJuros);
//exibir(“Valor investido: ” + investimento);
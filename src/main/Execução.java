package main;

import Exemplos.metodossemmain;
import Exercicios_easy.Exec.Exec3ex2;
import Exercicios_easy.Exec2;
import Exercicios_easy.Exec3;
import Exercicios_easy.Exec4;
import Exercicios_easy.Exec5;

public class Execução {
    public static void main(String[] args) {
        metodossemmain exec = new metodossemmain();
        exec.printarnomes("Michell", "Nunes");
        System.out.println(exec.multiplicarDoisNumeros(1, 8, 9));
        System.out.println(exec.somarTresNumeros(100, 15, 235));
        exec.printarnomes("Michell" , "Melo");
        exec.Exibircores("Azul", "Vermelho");
        System.out.println(exec.Divisaodosnumeros(10850, 52, 100));
        System.out.println(exec.multiplicarDoisNumeros(48, 85, 15));

        Exec2 exec2 = new Exec2();
        System.out.println(exec2.palavra("Michell"));

        Exec3 exec3 = new Exec3();
        System.out.println(exec3.nomeSobrenome(" Michell ", "  Melo "));

        Exec3ex2 exec3ex2 = new Exec3ex2();
        System.out.println(exec3ex2.inverterNomes(" Michell ", " Melo "));

        Exec4 exec4 = new Exec4();
        int Soma = exec4.FazerSoma(2);
        System.out.println(Soma);

        Exec5 exec5 = new Exec5();
        System.out.println(" Minha Media será " + exec5.minhaMedia(1, 8, 50));
        System.out.println(" Minha Soma é " + exec5.Soma(8, 79, 78));
        System.out.println(" Minha Subtração será "  + exec5.Subtração(58, 78, 41));
        System.out.println(" Minha Multiplicação é " + exec5.Multiplicação(58, 12, 41));

    }

}

package main;

import Exemplos.metodossemmain;
import Exercicios_easy.Exec2;
import Exercicios_easy.Exec3;

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

    }

}

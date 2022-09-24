package main;

import Exemplos.metodossemmain;

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
    }

}

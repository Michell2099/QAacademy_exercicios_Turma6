package Exemplos;

import java.io.OutputStream;

// Chamar metodos dentro da minha propria classe.


public class MetodossemretornoMain {
    public static void main(String[] args) {
        menino();
        menina();
        Pai();
        Mae();
        Tio();
    }
    public static void menino (){
        System.out.println("Menino");
    }
    public static void menina (){
        System.out.println("Menina");
    }
    public static void Pai (){
        System.out.println("Pai");
    }
    public static void Mae (){
        System.out.println("Mãe");
    }
    public static void Tio (){
        System.out.println("Tio");
    }
}


package Exemplos;

import javax.xml.catalog.CatalogManager;

public class MetodoscomparametrosMain {
    public static void main(String[] args) {
        texto("Morde", " xixi ");
        carro("Veloz", " batida");
        Mulher("Loira", " alta");
        Escola("Alunos", "lição");
        Prova("Passou ", "/ Não passou ");
        mega(" Parabens voce esta milionario ", " Não foi dessa vez ");

        String Cama = cama(" Deita "," dorme ");
        System.out.println("O que fazemos na cama? " + Cama);

        String bola = Bola(" Corre ",  " chuta ");
        System.out.println("O que fazemos com a bola? " + bola);

        String crianca = crianca(" Feliz "," Iluminada ");
        System.out.println("A Criança é: " + crianca);

        String rato = rato(" come "," queijo ");
        System.out.println("O que o rato come? " + rato);

        String Pipa = pipa(" Na mão " , " não ");
        System.out.println("Quando o cara me corta na mão o que eu falo? " +  Pipa);

    }

    public static void texto(String corre, String pula) {
        System.out.println(" O Texto é:" + corre + "" + pula);
    }

    public static void carro(String carro, String batida) {
        System.out.println(" O Texto é:" + carro + "" + batida);
    }

    public static void Mulher(String Mulher, String bonita) {
        System.out.println(" O Texto é:" + Mulher + "" + bonita);
    }

    public static void Escola(String sala, String Caderno) {
        System.out.println(" O Texto é:" + sala + "" + Caderno);
    }

    public static void Prova(String Aprovado, String Reprovado) {
        System.out.println(" O Texto é:" + Aprovado + "" + Reprovado);
    }
    public static void mega( String mega , String bingo){
        System.out.println(" O Texto é:" + mega + "" + bingo);
    }

    public static String cama(String cama,String faz) {
        return cama + faz;
    }
    public static String Bola(String bola,String faz) {
        return bola + faz;
    }
    public static String crianca(String crianca, String faz) {
        return crianca + faz;
    }
    public static String rato(String rato, String faz) {
        return rato + faz;
    }
    public static String pipa(String pipa, String faz) {
        return pipa + faz;
    }
}
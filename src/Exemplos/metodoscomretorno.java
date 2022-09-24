package Exemplos;

import java.sql.SQLOutput;

public class metodoscomretorno {
    public static void main(String[] args) {

        String cidade1 = saopaulo();
        System.out.println(cidade1);
       String cidade2  = rio();
       System.out.println(cidade2);
       String cidade3 = sergipe();
      String cidade4 = Guarulhos();
      System.out.println(cidade4);
       String cidade5 = Alagoas();
      System.out.println(cidade5);

        //System.out.println(saopaulo());
        // System.out.println(rio());
       // System.out.println(sergipe());
       // System.out.println(Guarulhos());
        // System.out.println(Alagoas());
    }
    public static String saopaulo (){
        return " São paulo";
    }
    public static String rio (){
        return " Rio de Janeiro";
    }
    public static String sergipe (){
        return " Sergipe";
    }
    public static String Guarulhos (){
        return " Guarulhos GRU GRU";
    }
    public static String Alagoas (){
        return " Alagoas";
    }
}

package Testes;

import Exercicios_easy.*;
import Exercicios_easy.Exec.Exec3ex2;
import org.junit.Test;

import java.util.concurrent.LinkedTransferQueue;

import static org.junit.Assert.assertEquals;

public class Exec2easyTest {
    @Test
    public void testeDejuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        String retorno = exec2.palavra("Carro");
        assertEquals("A palavra é carro", retorno);
    }


    @Test
    public void ExibirNomeSobrenome() {
        Exec3 exec3 = new Exec3();
        String retorno = exec3.nomeSobrenome("Michell", "Melo");
        assertEquals("O Nome é: Michell Melo", retorno);
    }


    @Test
    public void ExibirtrocaNome() {
        Exec3ex2 exec3ex2 = new Exec3ex2();
        String retorno = exec3ex2.inverterNomes("Michell", "Melo");
        assertEquals("O Nome é: Melo Michell", retorno);
    }


    @Test
    public void ExibirDoble() {
        Exec4 exec4 = new Exec4();
        int dobro = exec4.FazerSoma(10);
        assertEquals("O doblo é invalido", 20, dobro);
    }

    @Test
    public void fazerCalculos() {
        Exec5 exec5 = new Exec5();
        int soma = exec5.soma(1, 5, 8);
        int mult = exec5.multiplicao(1, 5, 8);
        int subtracao = exec5.subtracao(1, 5, 8);
        int media = exec5.minhaMedia(1, 5, 8);

        assertEquals(14, soma);
        assertEquals(40, mult);
        assertEquals(-12, subtracao);
        assertEquals(4, media);
    }
    @Test
    public void ExibirResultado (){
        Exec6 exec6 = new Exec6();

    }
}

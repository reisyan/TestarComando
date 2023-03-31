package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean comunicando;
        System.out.println("Responda somente com true ou false:");

        System.out.println("HammerHead Está comunicando:");
        comunicando = entrada.nextBoolean();


        if (comunicando) {
            System.out.println("Habilitar botão gravar");
            System.out.println("Habilitar botão desliga");
            System.out.println("Ocultar mensagens de erro");
        }

        boolean falhadeComunicacao;
        System.out.printf("HammerHead Está com falha de comunicação:");
        falhadeComunicacao = entrada.nextBoolean();

        if (falhadeComunicacao) {
            System.out.println("Desabilita botão Grava");
            System.out.println("Desabilita Botão Desliga");
            System.out.println("Exibe mensagem de Falha de Comunicação");
        }
        boolean gravandoemDisco;
        System.out.printf("HammerHead Está Comunicando && Gravando disco:");
        gravandoemDisco = entrada.nextBoolean();

        if (comunicando && gravandoemDisco) {
            System.out.println("Desabilita Botão Desliga");
            System.out.println("Habilita Botão Stop");
        }

        boolean botaoGravarApertado;
        System.out.printf("HammerHead Está com o Botão gravar apertado:");
        botaoGravarApertado = entrada.nextBoolean();

        if (botaoGravarApertado) {
            System.out.println("Inicia gravação");
            System.out.printf("Desabilita Botão Desliga");
            System.out.printf("Desabilita Botão Gravar");

        }
        boolean botaoStopApertado;
        System.out.printf("HammerHead Está com Botão Stop está apertado:");
        botaoStopApertado = entrada.nextBoolean();

        if (botaoStopApertado) {
            System.out.println("Interrompe gravação");
            System.out.printf("Habilita Botão Desliga");
            System.out.printf("Desabilita Botão Gravar");
        }
        boolean botaoDesligaApertado;
        System.out.printf("HammerHead Está com Botão Desliga está Apertado:");
        botaoDesligaApertado = entrada.nextBoolean();

        if (botaoDesligaApertado) {
            System.out.println("Desabilita botão Grava");
            System.out.printf("Desabilita Botão Desliga");
            System.out.printf("Exibe mensagem de Desligando");
        }
    }
}

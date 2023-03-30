package com.company;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean comunicando = true;
        boolean falhaComunicacao = true;
        boolean gravandoemDisco = true;
        boolean botaoGravarApertado = true;
        boolean botaoStopApertado = true;
        boolean botaoDesligaApetado = true;


        if (comunicando) {
            System.out.println("Habilitar botão gravar");
            System.out.println("Habilitar botão desliga");
        } else {
            System.out.println("Ocultar mensagens de erro");
        }
        if (falhaComunicacao) {
            System.out.println("Desabilita botão Grava");
            System.out.println("Desabilita Botão Desliga");
        } else {
            System.out.println("Exibe mensagem de Falha de Comunicação");
        }
        if (comunicando && gravandoemDisco) {
            System.out.println("Desabilita Botão Desliga");
        } else {
            System.out.println("Habilita Botão Stop");
        }
        if (botaoGravarApertado) {
            System.out.println("Inicia gravação");
            System.out.printf("Desabilita Botão Desliga");
        }else {
            System.out.println(" Desabilita Botão Gravar");
        }
        if(botaoStopApertado) {
            System.out.println("Interrompe gravação");
            System.out.println("Habilita Botão Desliga");
        }else{
            System.out.println("Desabilita Botão Gravar");
        }
        if(botaoDesligaApetado) {
            System.out.printf("Desabilita botão Grava");
            System.out.println("Desabilita Botão Desliga");
        }else {
            System.out.println("Exibe mensagem de Desligando");
        }


    }
}

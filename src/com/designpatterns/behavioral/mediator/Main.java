package com.designpatterns.behavioral.mediator;

public class Main {

    public static void main(String[] args) {

        ChatBot chatBot1 = new ChatBot();
        SalaDeChatMediator salaDeChat1 = new SalaDeChatMediator(chatBot1, "Sala de Chat 1");

        ChatBot chatBot2 = new ChatBot();
        SalaDeChatMediator salaDeChat2 = new SalaDeChatMediator(chatBot2, "Sala de Chat 2");

        Humano joao = new Humano("Joao");
        Humano maria = new Humano("Maria");
        Humano paulo = new Humano("Paulo");
        Humano lucia = new Humano("Lucia");
        Humano pedro = new Humano("Pedro");

        joao.setMediator(salaDeChat1);
        maria.setMediator(salaDeChat1);
        paulo.setMediator(salaDeChat1);

        lucia.setMediator(salaDeChat2);
        pedro.setMediator(salaDeChat2);

        System.out.println("[Sala 1] - Joao envia sua primeira mensagem");
        joao.enviar("Ola pessoal da sala 1, tudo bem");

        System.out.println("[Sala 2] - Lucia envia sua primeira mensagem");
        lucia.enviar("Ola pessoal da sala 2, tudo bem");

        System.out.println("[Sala 1] - Paulo envia sua primeira mensagem");
        paulo.enviar("Tudo bem");

        System.out.println("[Sala 1] - Paulo envia sua primeira mensagem");
        paulo.enviar("E com voce?");

        System.out.println("[Sala 2] - Pedro nao responde, Lucia tenta enviar outra mensagem");
        lucia.enviar("Pedro, vc esta ai?");

        System.out.println("Lucia troca de sala de chat");
        lucia.setMediator(salaDeChat1);

        System.out.println("[Sala 1] - Lucia envia sua primeira mensagem na sala");
        lucia.enviar("Ola pessoal da sala 1, sou a Lucia, tudo bem?");
    }
}

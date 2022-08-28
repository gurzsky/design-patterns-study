package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Fabricante.ArCondicionado;
import com.designpatterns.behavioral.command.Fabricante.Lampada;

public class Cliente {

    public static void main(String[] args) {
        Lampada lampadaSala = new Lampada("Lampada da Sala", false);
        Lampada lampadaQuarto = new Lampada("Lampada do Quarto", false);
        ArCondicionado arCondicionado = new ArCondicionado("Ar-condicionado", false, 26);

        Aplicativo aplicativo = new Aplicativo();
        LigarLampada ligarLampadaQuarto = new LigarLampada(lampadaQuarto);
        DesligarLampada desligarLampadaQuarto = new DesligarLampada(lampadaQuarto);

        LigarLampada ligarLampadaSala = new LigarLampada(lampadaSala);
        DesligarLampada desligarLampadaSala = new DesligarLampada(lampadaSala);

        LigarArCondicionado ligarAr = new LigarArCondicionado(arCondicionado);
        DesligarArCondicionado desligarAr = new DesligarArCondicionado(arCondicionado);
        MudarTemperaturaArCondicionado mudarTemperaturaAr = new MudarTemperaturaArCondicionado(arCondicionado);

        int idLigarLampadaQuarto = aplicativo.setCommands(ligarLampadaQuarto);
        int idDesligarLampadaQuarto = aplicativo.setCommands(desligarLampadaQuarto);

        int idLigarLampadaSala = aplicativo.setCommands(ligarLampadaSala);
        int idDesligarLampadaSala = aplicativo.setCommands(desligarLampadaSala);

        int idLigarAr = aplicativo.setCommands(ligarAr);
        int idDesligarAr = aplicativo.setCommands(desligarAr);
        int idMudarTemperaturaAr = aplicativo.setCommands(mudarTemperaturaAr);

        aplicativo.aoPrecionarBotao(idLigarLampadaQuarto);
        aplicativo.aoPrecionarBotao(idDesligarLampadaQuarto);

        aplicativo.aoPrecionarBotao(idLigarLampadaSala);
        aplicativo.aoPrecionarBotao(idDesligarLampadaSala);

        aplicativo.aoPrecionarBotao(idLigarAr);
        mudarTemperaturaAr.setTemperatura(25);
        aplicativo.aoPrecionarBotao(idMudarTemperaturaAr);
        aplicativo.aoPrecionarBotao(idDesligarAr);
    }
}

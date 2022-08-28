package com.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {

    private List<Command> commands = new ArrayList<>();

    public int setCommands(Command command) {
        this.commands.add(command);
        return commands.size() - 1;
    }

    public void aoPrecionarBotao(int id) {
        this.commands.get(id).executar();
    }

    public void duploCliqueBotao(int id) {
        this.commands.get(id).desfazer();
    }

    public Command getCommand(int id) {
        return this.commands.get(id);
    }
}

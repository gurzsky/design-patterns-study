package com.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<MementoInterface> historico = new ArrayList<>();

    public void criarCheckPoint(OriginadorInterface originador) {
        historico.add(originador.salvar());
    }

    public void desfazer() {
        if (this.historico.size() < 1)
            return;

        MementoInterface memento = this.historico.remove(this.historico.size() - 1);
        memento.restaurar();
    }

    public void imprimir(OriginadorInterface originador) {
        originador.imprimir();
    }
}

package subjects;

import observers.Assinante;
import models.Vaga;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEmpregosConcreta implements AgenciaEmpregos {
    private List<Assinante> assinantes;

    public AgenciaEmpregosConcreta() {
        this.assinantes = new ArrayList<>();
    }

    @Override
    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    @Override
    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    @Override
    public void notificarAssinantes(Vaga vaga) {
        for (Assinante assinante : assinantes) {
            assinante.atualizar(vaga);
        }
    }

    public void novaVagaDisponivel(Vaga vaga) {
        System.out.println("Nova vaga disponível: " + vaga);
        notificarAssinantes(vaga);
    }
}

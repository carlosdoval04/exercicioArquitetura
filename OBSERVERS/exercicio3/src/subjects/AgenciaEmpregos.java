package subjects;

import observers.Assinante;
import models.Vaga;

public interface AgenciaEmpregos {
    void adicionarAssinante(Assinante assinante);
    void removerAssinante(Assinante assinante);
    void notificarAssinantes(Vaga vaga);
}

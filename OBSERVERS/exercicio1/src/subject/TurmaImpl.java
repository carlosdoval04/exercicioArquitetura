package subject;

import observer.Observador;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class TurmaImpl implements Turma {
    private List<Observador> observadores = new ArrayList<>();
    private List<Aluno> boletins = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Aluno aluno : boletins) {
            for (Observador observador : observadores) {
                observador.atualizar(aluno);
            }
        }
    }

    @Override
    public void publicarBoletim(Aluno aluno) {
        boletins.add(aluno);
        notificarObservadores();
    }
}

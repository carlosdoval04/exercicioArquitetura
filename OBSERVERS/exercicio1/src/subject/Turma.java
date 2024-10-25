package subject;

import observer.Observador;
import model.Aluno;

public interface Turma {
    public void adicionarObservador(Observador observador);
    public void removerObservador(Observador observador);
    public void notificarObservadores();
    public void publicarBoletim(Aluno aluno);
}

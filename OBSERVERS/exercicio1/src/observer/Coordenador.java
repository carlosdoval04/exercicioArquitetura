package observer;

import model.Aluno;

public class Coordenador implements Observador {
    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Coordenador foi notificado: Aluno " + aluno.getNome() + " tem média " + aluno.getMedia());
    }
}

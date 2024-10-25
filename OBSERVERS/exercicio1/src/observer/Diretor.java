package observer;

import model.Aluno;

public class Diretor implements Observador {
    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Diretor foi notificado: Aluno " + aluno.getNome() + " tem média " + aluno.getMedia());
    }
}

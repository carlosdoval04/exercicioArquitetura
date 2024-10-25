package observer;

import model.Aluno;

public class Professor implements Observador {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Professor " + nome + " foi notificado: Aluno " + aluno.getNome() + " tem média " + aluno.getMedia());
    }
}

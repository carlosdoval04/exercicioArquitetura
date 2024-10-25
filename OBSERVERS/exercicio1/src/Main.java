import model.Aluno;
import observer.Professor;
import observer.Coordenador;
import observer.Diretor;
import subject.Turma;
import subject.TurmaImpl;

public class Main {
    public static void main(String[] args) {
        Turma turma = new TurmaImpl();
        
        Professor professor1 = new Professor("João");
        Coordenador coordenador = new Coordenador();
        Diretor diretor = new Diretor();

        turma.adicionarObservador(professor1);
        turma.adicionarObservador(coordenador);
        turma.adicionarObservador(diretor);

        Aluno aluno1 = new Aluno("Carlos");
        aluno1.setP1(8.0);
        aluno1.setP2(7.5);

        turma.publicarBoletim(aluno1);

        Aluno aluno2 = new Aluno("Mariana");
        aluno2.setP1(9.5);
        aluno2.setP2(8.0);

        turma.publicarBoletim(aluno2);
    }
}

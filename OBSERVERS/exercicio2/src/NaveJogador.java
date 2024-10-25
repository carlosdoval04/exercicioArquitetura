import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaveJogador implements Jogador {
    private static NaveJogador instanciaUnica;
    private List<Inimigo> inimigos = new ArrayList<>();
    private Acoes acaoAtual;
    private Random random = new Random();

    // Singleton: Construtor privado
    private NaveJogador() {}

    public static NaveJogador getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new NaveJogador();
        }
        return instanciaUnica;
    }

    @Override
    public void adicionarNave(Inimigo inimigo) {
        inimigos.add(inimigo);
    }

    @Override
    public void removerNave(Inimigo inimigo) {
        inimigos.remove(inimigo);
        System.out.println("Inimigo removido.");
    }

    @Override
    public void notificar() {
        for (Inimigo inimigo : inimigos) {
            inimigo.atualizar(acaoAtual);
        }
    }

    @Override
    public void movimentarNaveAleatoriamente() {
        Acoes[] direcoes = Acoes.values();
        acaoAtual = direcoes[random.nextInt(direcoes.length)];
        System.out.println("Jogador se moveu para: " + acaoAtual);
        notificar();
    }
}

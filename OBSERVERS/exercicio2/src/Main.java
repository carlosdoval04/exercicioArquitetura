public class Main {
    public static void main(String[] args) {
        NaveJogador jogador = NaveJogador.getInstancia();
        
        NaveInimiga inimigo1 = new NaveInimiga("Inimigo 1");
        NaveInimiga inimigo2 = new NaveInimiga("Inimigo 2");
        NaveInimiga inimigo3 = new NaveInimiga("Inimigo 3");

        jogador.adicionarNave(inimigo1);
        jogador.adicionarNave(inimigo2);
        jogador.adicionarNave(inimigo3);

        for (int i = 0; i < 5; i++) {
            jogador.movimentarNaveAleatoriamente();
            if (i == 2) {
                jogador.removerNave(inimigo2);
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

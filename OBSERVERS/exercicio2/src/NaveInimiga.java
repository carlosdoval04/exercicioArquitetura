public class NaveInimiga implements Inimigo {
    private String nome;

    public NaveInimiga(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Acoes acao) {
        System.out.println(nome + " seguiu o jogador na direção: " + acao);
    }
}

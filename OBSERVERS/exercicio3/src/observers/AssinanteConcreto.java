package observers;

import models.Vaga;

public class AssinanteConcreto implements Assinante {
    private String nome;

    public AssinanteConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Vaga vaga) {
        System.out.println(nome + " recebeu notificação de nova vaga: " + vaga);
    }
}

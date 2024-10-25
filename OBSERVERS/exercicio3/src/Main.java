import models.Vaga;
import observers.AssinanteConcreto;
import subjects.AgenciaEmpregosConcreta;

public class Main {
    public static void main(String[] args) {
        AgenciaEmpregosConcreta agencia = new AgenciaEmpregosConcreta();

        AssinanteConcreto assinante1 = new AssinanteConcreto("João");
        AssinanteConcreto assinante2 = new AssinanteConcreto("Maria");
        AssinanteConcreto assinante3 = new AssinanteConcreto("Carlos");

        agencia.adicionarAssinante(assinante1);
        agencia.adicionarAssinante(assinante2);
        agencia.adicionarAssinante(assinante3);

        Vaga vaga1 = new Vaga("Desenvolvedor Java", "Desenvolvimento de sistemas web em Java.");
        agencia.novaVagaDisponivel(vaga1);

        Vaga vaga2 = new Vaga("Analista de Sistemas", "Análise de sistemas e processos.");
        agencia.novaVagaDisponivel(vaga2);

        agencia.removerAssinante(assinante2);

        Vaga vaga3 = new Vaga("Designer Gráfico", "Criação de layouts e material visual.");
        agencia.novaVagaDisponivel(vaga3);
    }
}

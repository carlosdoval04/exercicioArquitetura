package facade;

import model.Endereco;

public class EnderecoFacade {
    private static EnderecoFacade instancia;
    private Endereco endereco;

    // Construtor privado (Singleton)
    private EnderecoFacade() {
        // Endereço padrão (opcional)
        endereco = new Endereco();
    }

    // Método para obter a instância única da EnderecoFacade
    public static EnderecoFacade getInstancia() {
        if (instancia == null) {
            instancia = new EnderecoFacade();
        }
        return instancia;
    }

    // Método para criar um endereço
    public void criarEndereco(String rua, int numero) {
        this.endereco = new Endereco(rua, numero);
    }

    // Método para alterar a rua do endereço
    public void alterarRua(String novaRua) {
        if (endereco != null) {
            endereco.setRua(novaRua);
        }
    }

    // Método para alterar o número do endereço
    public void alterarNumero(int novoNumero) {
        if (endereco != null) {
            endereco.setNumero(novoNumero);
        }
    }

    // Método para exibir o endereço
    public void exibirEndereco() {
        if (endereco != null) {
            System.out.println(endereco.toString());
        } else {
            System.out.println("Endereço ainda não foi criado.");
        }
    }
}

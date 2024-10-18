import facade.ClienteFacade;
import facade.ProdutoFacade;
import model.Endereco;

public class Main {
    public static void main(String[] args) {
        ClienteFacade clienteFacade = ClienteFacade.getInstancia();
        Endereco endereco = new Endereco("Rua Exemplo", 123);

        // Criando um cliente
        clienteFacade.criarCliente("João", endereco);

        // Usando a ProdutoFacade para criar produtos
        ProdutoFacade produtoFacade = ProdutoFacade.getInstancia();

        // Criando produtos utilizando o método da ProdutoFacade
        produtoFacade.criarProduto("Laptop", "Eletrônicos", 2500.00);
        produtoFacade.criarProduto("Smartphone", "Eletrônicos", 1500.00);

        // Exibindo detalhes do cliente e produtos
        clienteFacade.exibirDetalhesCliente();

        // Exibindo produtos gerenciados pela ProdutoFacade
        System.out.println("Produtos gerenciados:");
        produtoFacade.exibirProdutos(); // Exibindo produtos
    }
}

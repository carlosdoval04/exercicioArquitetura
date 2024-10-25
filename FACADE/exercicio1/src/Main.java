import facade.ClienteFacade;
import facade.ProdutoFacade;
import model.Endereco;

public class Main {
    public static void main(String[] args) {
        ClienteFacade clienteFacade = ClienteFacade.getInstancia();
        Endereco endereco = new Endereco("Rua Exemplo", 123);

        clienteFacade.criarCliente("João", endereco);

        ProdutoFacade produtoFacade = ProdutoFacade.getInstancia();

        produtoFacade.criarProduto("Laptop", "Eletrônicos", 2500.00);
        produtoFacade.criarProduto("Smartphone", "Eletrônicos", 1500.00);

        clienteFacade.exibirDetalhesCliente();

        System.out.println("Produtos gerenciados:");
        produtoFacade.exibirProdutos();
    }
}

package facade;

import model.Produto;
import model.Endereco;

import java.util.List;

public class ClienteFacade {
    private static ClienteFacade instancia;

    private ClienteFacade() {}

    public static ClienteFacade getInstancia() {
        if (instancia == null) {
            instancia = new ClienteFacade();
        }
        return instancia;
    }

    // Método para criar um cliente (exemplo)
    public void criarCliente(String nome, Endereco endereco) {
        // Implementação para criar cliente
    }

    // Método para adicionar um produto ao cliente (exemplo)
    public void adicionarProdutoAoCliente(Produto.ProdutoDetalhe produto) {
        // Implementação para adicionar produto ao cliente
    }

    // Método para criar produtos a partir de uma lista
    public void criarProduto(List<Produto.ProdutoDetalhe> listaProdutos) {
        Produto produtoManager = Produto.getInstanciaUnica();
        for (Produto.ProdutoDetalhe produto : listaProdutos) {
            produtoManager.adicionarProduto(produto.getNome(), produto.getCategoria(), produto.getPreco());
        }
    }

    // Método para exibir detalhes do cliente (exemplo)
    public void exibirDetalhesCliente() {
        // Implementação para exibir detalhes do cliente
    }
}

package facade;

import model.Produto;

import java.util.List;

import factory.ProdutoFactory;

public class ProdutoFacade {
    private static ProdutoFacade instancia;

    private ProdutoFacade() {}

    public static ProdutoFacade getInstancia() {
        if (instancia == null) {
            instancia = new ProdutoFacade();
        }
        return instancia;
    }

    public void criarProduto(String nome, String categoria, double preco) {
        Produto produtoManager = Produto.getInstanciaUnica();
        produtoManager.adicionarProduto(nome, categoria, preco);
    }

    public List<Produto.ProdutoDetalhe> criarProdutos() {
        return ProdutoFactory.criarProdutos();
    }

    public void exibirProdutos() {
        Produto.getInstanciaUnica().exibirProdutos();
    }
}

package factory;

import model.Produto;

import java.util.Arrays;
import java.util.List;

public class ProdutoFactory {

    public static Produto.ProdutoDetalhe criarProduto(String nome, String categoria, double preco) {
        return new Produto.ProdutoDetalhe(nome, categoria, preco);
    }

    public static List<Produto.ProdutoDetalhe> criarProdutos() {
        return Arrays.asList(
            new Produto.ProdutoDetalhe("Laptop", "Eletrônicos", 2500.00),
            new Produto.ProdutoDetalhe("Smartphone", "Eletrônicos", 1500.00)
        );
    }
}

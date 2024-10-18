package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private static Produto instanciaUnica;
    private List<ProdutoDetalhe> produtos;

    // Classe interna para representar detalhes do produto
    public static class ProdutoDetalhe {
        private String nome;
        private String categoria;
        private double preco;

        public ProdutoDetalhe(String nome, String categoria, double preco) {
            this.nome = nome;
            this.categoria = categoria;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public String getCategoria() {
            return categoria;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "ProdutoDetalhe{" +
                    "nome='" + nome + '\'' +
                    ", categoria='" + categoria + '\'' +
                    ", preco=" + preco +
                    '}';
        }
    }

    private Produto() {
        produtos = new ArrayList<>();
    }

    public static Produto getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new Produto();
        }
        return instanciaUnica;
    }

    public void adicionarProduto(String nome, String categoria, double preco) {
        ProdutoDetalhe novoProduto = new ProdutoDetalhe(nome, categoria, preco);
        produtos.add(novoProduto);
    }

    public List<ProdutoDetalhe> getProdutos() {
        return produtos;
    }

    public void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (ProdutoDetalhe produto : produtos) {
            System.out.println(produto);
        }
    }
}

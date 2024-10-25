package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<EstoqueItem> itensEstoque;
    private static Estoque instance;

    private Estoque() {
        this.itensEstoque = new ArrayList<>();
    }

    public static Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        itensEstoque.add(new EstoqueItem(produto, quantidade));
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        for (EstoqueItem item : itensEstoque) {
            if (item.getProduto().getCodigo() == produto.getCodigo() && item.getQuantidade() >= quantidade) {
                item.setQuantidade(item.getQuantidade() - quantidade);
                return true;
            }
        }
        return false;
    }

    public List<EstoqueItem> getListaEstoque() {
        return itensEstoque;
    }

    private class EstoqueItem {
        private Produto produto;
        private int quantidade;

        public EstoqueItem(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarItem(ItemPedido item) {
        Estoque estoque = Estoque.getInstance();
        if (estoque.removerProduto(item.getProduto(), item.getQuantidade())) {
            itens.add(item);
            calcularTotal();
        } else {
            System.out.println("Estoque insuficiente para o produto: " + item.getProduto().getCodigo());
        }
    }

    public void calcularTotal() {
        valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
    }

    public void cupomFiscal() {
        System.out.println("Cupom Fiscal");
        for (ItemPedido item : itens) {
            System.out.println("Produto: " + item.getProduto().getCodigo() +
                               " Quantidade: " + item.getQuantidade() +
                               " Total: " + (item.getProduto().getPreco() * item.getQuantidade()));
        }
        System.out.println("Valor total: " + valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }
}

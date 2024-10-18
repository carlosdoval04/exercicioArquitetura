package facade;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class PedidoFacade {
    private Pedido pedido;

    public PedidoFacade() {
        this.pedido = new Pedido();
    }

    public void adicionarItemAoPedido(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(quantidade, produto);
        pedido.adicionarItem(item);
    }

    public void gerarCupomFiscal() {
        pedido.cupomFiscal();
    }

    public double getTotalPedido() {
        return pedido.getValorTotal();
    }
}

import facade.PedidoFacade;
import model.Estoque;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = Estoque.getInstance();

        //Ajeitar produto
        Produto produto1 = new Produto(1, 50.0, "Eletrônicos");
        Produto produto2 = new Produto(2, 100.0, "Eletrodomésticos");

        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 5);

        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.adicionarItemAoPedido(produto1, 2);
        pedidoFacade.adicionarItemAoPedido(produto2, 3);

        pedidoFacade.gerarCupomFiscal();

        System.out.println("Valor total do pedido: " + pedidoFacade.getTotalPedido());
    }
}

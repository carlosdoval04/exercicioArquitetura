package facade;

import composite.Component;
import composite.Composite;
import composite.Leaf;

public class CestaCafeFacade {
    private Composite cesta;

    public CestaCafeFacade(String nomeDaCesta) {
        this.cesta = new Composite(nomeDaCesta);
    }

    public void adicionarItem(String nome, double preco) {
        Component item = new Leaf(preco, nome);
        cesta.adicionar(item);
    }

    public void removerItem(Component item) {
        cesta.remover(item);
    }

    public double calcularPrecoTotal() {
        return cesta.getPreco();
    }

    public void mostrarCesta() {
        System.out.println(cesta);
    }
}

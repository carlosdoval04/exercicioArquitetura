package cliente;

import facade.CestaCafeFacade;

public class UsaCesta {

    public static void main(String[] args) {
        CestaCafeFacade cestaCafe = new CestaCafeFacade("Cesta de Café da Manhã");

        cestaCafe.adicionarItem("Café", 12.56);
        cestaCafe.adicionarItem("Leite", 10.26);
        cestaCafe.adicionarItem("Pão de Queijo", 6.12);

        CestaCafeFacade caixaBombom = new CestaCafeFacade("Caixa de Bombom");
        caixaBombom.adicionarItem("Bombom Licor", 9.78);
        caixaBombom.adicionarItem("Bombom Cereja", 8.23);

        cestaCafe.adicionarItem("Caixa de Bombom", caixaBombom.calcularPrecoTotal());

        cestaCafe.mostrarCesta();

        double precoTotal = cestaCafe.calcularPrecoTotal();
        System.out.println("Total: R$ " + precoTotal);
    }
}

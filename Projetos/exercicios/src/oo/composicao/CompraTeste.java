package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "João Pedro";

        c1.setAdicionarItem(new Item("Caneta", 20, 7.45));
        c1.setAdicionarItem(new Item("Borracha", 12, 3.89));
        c1.setAdicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println(c1.itens.size());
        System.out.println("Valor total da compra é R$ " + c1.getValorTotal());

        // relação bidirecional
        double total = c1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é R$ " + total);
    }
}

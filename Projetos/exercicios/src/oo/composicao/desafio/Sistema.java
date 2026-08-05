package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Soler");

        Compra compra1 = new Compra();
        compra1.setItem("Caneta", 9.67, 100);
        compra1.setItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.setItem("Caderno", 10, 10);
        compra2.setItem(new Produto("Impressora", 999.99), 1);

        cliente.setCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.getValorTotal());
    }
}

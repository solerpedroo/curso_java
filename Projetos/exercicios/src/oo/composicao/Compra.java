package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void setAdicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    void setAdicionarItem(String nome, int quantidade, double preco){
        this.setAdicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal(){
        double total = 0;
        for (Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}

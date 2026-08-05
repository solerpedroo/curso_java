package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<>();

    double getValorTotal(){
        double total =0;
        for(Compra compra: compras){
            total += compra.getValorTotal();
        }
        return total;
    }

    void setCompra(Compra compra){
        this.compras.add(compra);
    }

    Cliente(String nome){
        this.nome = nome;
    }
}

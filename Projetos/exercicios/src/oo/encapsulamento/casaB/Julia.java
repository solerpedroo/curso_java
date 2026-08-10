package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    Ana ana = new Ana();
    void testeAcessos() {
        /*System.out.println(ana.segredo);
        System.out.println(ana.facoDentroDeCasa);   não é possível acessar (ambos os comentados)
        System.out.println(ana.formaDeFalar);*/
        System.out.println(ana.todosSabem);
    }
}

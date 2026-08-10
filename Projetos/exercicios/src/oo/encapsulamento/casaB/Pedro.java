package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    void testeAcessos(){
        /*System.out.println(ana.segredo);
        System.out.println(ana.facoDentroDeCasa);*/ // não é possível acessar ambos

        // para acessar via herança, não se usa via a instância do objeto
        System.out.println(formaDeFalar); // maneira correta de acessar
        System.out.println(todosSabem);
    }
}

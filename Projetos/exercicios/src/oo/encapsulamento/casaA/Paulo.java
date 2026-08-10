package oo.encapsulamento.casaA;

public class Paulo {
    Ana ana = new Ana();
    void testeAcessos(){
        /*System.out.println(ana.segredo);*/ // não é possível acessar
        System.out.println(ana.facoDentroDeCasa);
        System.out.println(ana.formaDeFalar);
        System.out.println(ana.todosSabem);
    }
}

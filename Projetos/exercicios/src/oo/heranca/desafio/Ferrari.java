package oo.heranca.desafio;

public class Ferrari extends Carro {
    // acelera mais rápido (15 em 15)

//    @Override
//    void acelerar() {
//        super.acelerar();
//    }

    Ferrari(){
        this(315);
    }

    Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }
}

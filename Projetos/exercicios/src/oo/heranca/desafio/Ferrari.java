package oo.heranca.desafio;

public class Ferrari extends Carro {
    // acelera mais rápido (15 em 15)

//    @Override
//    public void acelerar() {
//        super.acelerar();
//    }

    public Ferrari(){
        this(315);
    }

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }
}

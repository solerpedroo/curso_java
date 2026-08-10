package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    // acelera mais rápido (15 em 15)

//    @Override
//    public void acelerar() {
//        super.acelerar();
//    }

    private boolean ligarTurbo; // forma implícita do false
    private boolean ligarAr = false;

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarAr && !ligarAr) return 35;
        else if (ligarAr && ligarAr) return 30;
        else if (!ligarAr && !ligarAr) return 20;
        else return 15;
    }

    public Ferrari(){
        this(315);
    }

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }
}

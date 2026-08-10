package oo.heranca.desafio;

public class Carro {
    public final double VELOCIDADE_MAXIMA;
    public double velocidadeAtual;
    private int delta = 5;

    public Carro(double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    // acelerar (5 em 5) e freiar (5 em 5)

    public void acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) velocidadeAtual = VELOCIDADE_MAXIMA;
        else velocidadeAtual += getDelta();
    }

    public void freiar(){
        if (velocidadeAtual >= 5) velocidadeAtual -= 5;
        else velocidadeAtual = 0;
    }

    public int getDelta() {
        return getDelta();
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    // poderia criar um metodo toString para mostrar a velocidade para não precisar ficar repetindo no main
}
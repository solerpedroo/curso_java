package oo.heranca.desafio;

public class Carro {
    public final double VELOCIDADE_MAXIMA;
    public double velocidadeAtual;
    protected int delta = 5;

    public Carro(double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    // acelerar (5 em 5) e freiar (5 em 5)

    public void acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) velocidadeAtual = VELOCIDADE_MAXIMA;
        else velocidadeAtual += delta;
    }

    public void freiar(){
        if (velocidadeAtual >= 5) velocidadeAtual -= 5;
        else velocidadeAtual = 0;
    }

    // poderia criar um metodo toString para mostrar a velocidade para não precisar ficar repetindo no main
}
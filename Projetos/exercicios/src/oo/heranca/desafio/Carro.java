package oo.heranca.desafio;

public class Carro {
    final double VELOCIDADE_MAXIMA;
    double velocidadeAtual;
    int delta = 5;

    Carro(double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    // acelerar (5 em 5) e freiar (5 em 5)

    void acelerar(){
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) velocidadeAtual = VELOCIDADE_MAXIMA;
        else velocidadeAtual += delta;
    }

    void freiar(){
        if (velocidadeAtual >= 5) velocidadeAtual -= 5;
        else velocidadeAtual = 0;
    }

    // poderia criar um metodo toString para mostrar a velocidade para não precisar ficar repetindo no main
}
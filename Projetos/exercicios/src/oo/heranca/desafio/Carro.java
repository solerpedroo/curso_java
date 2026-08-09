package oo.heranca.desafio;

public class Carro {
    double velocidadeAtual;

    // acelerar (5 em 5) e freiar (5 em 5)

    void acelerar(){
        velocidadeAtual += 5;
    }

    void freiar(){
        if (velocidadeAtual >= 5) velocidadeAtual -= 5;
        else velocidadeAtual = 0;
    }

    // poderia criar um metodo toString para mostrar a velocidade para não precisar ficar repetindo no main
}
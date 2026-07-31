package oo.composicao;

public class Motor {
    final Carro carro;
    boolean ligado = false;
    double falorInjecao = 1;

    Motor(Carro c){
        this.carro = c;
    }

    int giros(){
        if (!ligado) return 0;
        else return (int) Math.round(falorInjecao * 3000);
    }
}

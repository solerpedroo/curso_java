package oo.composicao;

public class Carro {
    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar(){
        if (motor.falorInjecao < 2.6) motor.falorInjecao += 0.4;
    }

    void frear(){
        if (motor.falorInjecao > 0.5) motor.falorInjecao -= 0.4;
    }

    void ligar(){
     motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}

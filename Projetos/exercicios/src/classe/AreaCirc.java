package classe;

public class AreaCirc {
    double raio;
    // final é igual dart, uma vez declarado ele fica imutável a variável
    static final double PI = 3.14;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio){
        return PI * Math.pow(raio, 2);
    }
}

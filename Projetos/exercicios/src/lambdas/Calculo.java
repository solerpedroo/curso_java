package lambdas;

@FunctionalInterface
public interface Calculo {
    public abstract double executar(double a, double b);

    default String metodoDefault(){
        return "não interfere na implementação";
    }

    static String metodoStatic(){
        return "não interfere na implementação";
    }
}

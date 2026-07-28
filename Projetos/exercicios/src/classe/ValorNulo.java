package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String a = "";
        System.out.println(a.concat("!!!"));

        // vai dar erro de incialização / compilação
        // String a2;
        // System.out.println(a2.concat("???"));

        // vai dar erro de tempo de execução - run time (null pointer exception)
        // String a2 = null;
        // System.out.println(a2.concat("???"));
    }
}

package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        boolean estaDeFerias = false;

        char status = 'A';

        System.out.println("Anos de empresa " + anosDeEmpresa*365);
        System.out.println("Numero de voos " + numerosDeVoos/2);
        System.out.println("Pontos por real " + pontosAcumulados/vendasAcumuladas);
        System.out.println("ID" + id + "recebe R$ " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}

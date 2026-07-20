package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        int a = 6*(3+2);
        int aElevado = (int)Math.pow(a, 2);
        int aFinal = aElevado / (3*2);

        int b = ((1-5)*(2-7))/2;
        int bElevado = (int)Math.pow(b,2);

        int subCima = aFinal - bElevado;
        int subCimaElevado = (int)Math.pow(subCima,3);
        int baixoElevado = (int)Math.pow(10,3);

        int resultado = subCimaElevado/baixoElevado;

        System.out.println(resultado);
    }
}

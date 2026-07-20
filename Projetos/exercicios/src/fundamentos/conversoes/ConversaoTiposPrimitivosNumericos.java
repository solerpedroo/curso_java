package fundamentos.conversoes;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // conversão implícita
        System.out.println(a);

        // solução padrão
        // float b = 1.0F;

        // cast
        float b = (float) 1.123456; // explícita
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}

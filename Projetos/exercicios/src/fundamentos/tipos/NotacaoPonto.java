package fundamentos.tipos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Pedro");
        s = s.toUpperCase();
        s = s.concat("!!\n");
        System.out.println(s);

        String x = "Ana\n".toUpperCase();
        System.out.println(x);
        System.out.println("Pedro\n".toUpperCase());

        String y = "Bom dia X".replace("X", "Brasil\n");
        System.out.println(y);

        String z = "Bom dia Y".replace("Y", "Leticia").toUpperCase().concat("!!!");
        System.out.println(z);
    }
}

package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        // nova forma de acessar é
        // AreaCirc.PI = 3.1415;

        AreaCirc a1 = new AreaCirc(10);

        System.out.println(AreaCirc.area(100));
        System.out.println(a1.area());
    }
}

package classe;
import classe.Data;

public class DataTeste {
    public static void main(String[] args) {
        // criar duas instâncias de datas

        Data d1 = new Data();
        d1.dia = 31;
        d1.mes = 10;
        d1.ano = 2006;

        System.out.printf("Data 1:\n%d/%d/%d\n\n", d1.dia, d1.mes, d1.ano);

        Data d2 = new Data();
        d2.dia = 15;
        d2.mes = 7;
        d2.ano = 2010;
        System.out.printf("Data 2:\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}

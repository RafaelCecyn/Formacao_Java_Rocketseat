package je08_controle_fluxo_excecao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            Number valor = NumberFormat.getInstance().parse("1.75");
            Double vd = valor.doubleValue();
            System.out.println(vd);
        } catch (ParseException e) {
            System.out.println("Número inválido");
        }

    }
}

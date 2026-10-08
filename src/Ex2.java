import java.util.Locale;
//formataçao de virgula pra ponto final
public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    double x;
    x = 3.1456;
    System.out.println(String.format("%.2f", x));
    }
}

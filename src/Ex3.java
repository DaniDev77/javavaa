import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

    int idade;
    double salario;
    String nome;
    char sexo;

    idade = 20;
    salario = 1560.8;
    nome = "Maria Silva";
    sexo = 'F';

    System.out.println("A funcionaria " + nome +", do sexo " + sexo +", tem "+idade+
            " anos e ganha R$"+String.format("%.2f",salario)+" por mês");
    }
}

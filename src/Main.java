//biblioteca Locale
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
      //linha feita para imprimir salario com virgula
      Locale.setDefault(Locale.US);

        int idade;
       double altura ,salario;
       char genero;
       String nome;

       idade = 30;
       salario = 1500.4;
       altura = 1.72;
       genero = 'M';
       nome = "Daniel Vilela";
       System.out.println("Idade: " + idade);
       System.out.println("Altura: " + String.format("%.2f" ,altura));
       System.out.println("Genero: " + genero);
       System.out.println("Salario: " + String.format("%.2f",salario));
    }
}

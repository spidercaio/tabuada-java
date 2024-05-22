import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("De qual número você quer a tabuada? ");
        int numeroTabuada = scanner.nextInt();

        System.out.println("Até que número você quer multiplicar o " + numeroTabuada + "?");
        int multiplicador = scanner.nextInt();

        int vezesMultiplicacao = 0;

        while (vezesMultiplicacao <= multiplicador){
            int multiplicacao = numeroTabuada * vezesMultiplicacao;
            System.out.println(numeroTabuada + " x " + vezesMultiplicacao + " = " + multiplicacao);
            vezesMultiplicacao++;
        }
        System.out.println("Fim :D");

        scanner.close();
    }
}

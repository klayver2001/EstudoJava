import java.util.Locale;
import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        // Criando variáveis 
        double saldo = 25.0;

        System.out.println("Digite o valor do saque: ");

        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque Autorizado, valor: " + valorSolicitado);

             }
        else
            System.out.println("Saldo Insuficiente");



             
        System.out.println("Saldo Atual é : "+saldo);
        scanner.close();
    }
}

public class CalculadoraImc {
    
    public static void main(String[] args) {

        // Os argumentos começam com índice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]); // Vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);
        double peso = Double.valueOf(args[4]);

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "cm.");
        System.out.println("Meu peso é " + peso + "kg.");
        System.out.println("Meu IMC é: " + imc);
    }
}
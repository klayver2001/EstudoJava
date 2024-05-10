import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
            String nomeAluno = scanner.next();

        System.out.println("Digite a nota do aluno:");
            int nota = scanner.nextInt();

        
       
       if(nota >= 7)
        System.out.println("Aluno " + nomeAluno + " : Aprovado V");

       else if (nota >= 5 && nota < 7 ) { // SEMPRE DEVERÁ RETORNAR TRUE OU FALSE
        System.out.println("Prova de recuperação");  
       }

       else
        System.out.println("Aluno " + nomeAluno +  " : Reprovado X ");

        scanner.close();
    }
}

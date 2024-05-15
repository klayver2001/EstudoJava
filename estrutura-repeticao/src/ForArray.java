// ExemploFor.java
public class ForArray {
    public static void main(String[] args) {
        // Em Arrays o indice começa em 0
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        

        /*/
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
        */
        
        
        
        
        // Forma abreviada

        for(String aluno : alunos) {
          System.out.println("Nome do aluno é = " + aluno);
        }
        
    }
}
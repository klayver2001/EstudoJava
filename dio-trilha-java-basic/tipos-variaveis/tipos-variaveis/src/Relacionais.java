public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        String nomeUm = "Klayver";
        String nomeDois = new String("Klayver");

        System.out.println(nomeUm.equals(nomeDois));
      
        String nomeTres = new String("JAVA");   
        
        System.out.println(nomeUm == nomeTres); //false

        String nomeQuatro = nomeTres;

        System.out.println(nomeTres == nomeQuatro); //true

        /*  Outros testes abaixo*/ 


        boolean simNao = numero1 == numero2;
  
        System.out.println("NúmeroUm é igual NúmeroDois ? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NúmeroUm é diferente de NúmeroDois ? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("NúmeroUm é maior que NúmeroDois ? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("NúmeroUm é menor que NúmeroDois ? " + simNao);

    }
}

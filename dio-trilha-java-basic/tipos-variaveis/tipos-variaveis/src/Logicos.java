public class Logicos {
    public static void main(String[] args) {
        
        boolean condicao1=true;

        boolean condicao2=true;

        if (condicao1 && ( 10 > 9)) { //também representa uma operação booleano dentro do parenteses
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2)  {
            System.out.println("Uma das condições é verdadeira");
        }


        System.out.println("Fim");
    }
}

package edu.klayver.segundasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {

        System.out.println( "Olá time, sejam bem vindos" );
        String primeiroNome="Francisco";
        String segundoNome="Klayver";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

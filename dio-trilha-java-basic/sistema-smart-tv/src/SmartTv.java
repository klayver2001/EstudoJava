public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    /* Muda o canal desejado como parametro*/
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }



    /* Muda o canal da tv */ 
    public void aumenrarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
        

    /* Aumentar e diminuir o volume da tv */
    public void aumentarVolume () {
        // volume = volume + 1;
        volume++;   
        System.out.println("Aumentando volume para:  " + volume);
    }
    public void diminuirVolume () {
        // volume = volume - 1;
        volume--;   
        System.out.println("Diminuir volume para: " + volume);
    }
    /* Liga e desliga a tv */

    public void ligar(){
        ligada = true ;
    }
    public void desligar(){
        ligada = false ;
    }

}

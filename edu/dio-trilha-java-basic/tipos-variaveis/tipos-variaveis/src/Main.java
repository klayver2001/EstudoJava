public class Main {

    public static void main(String[] args) {
        // Criando um objeto da classe Radar
        Radar radar = new Radar();

        // Chamando o método verificarVelocidade
        radar.verificarVelocidade("carro", 80.0, 100.0);
        radar.verificarVelocidade("Caminhão", 100.0, 100.0);
        radar.verificarVelocidade("CARRO", 120.0, 100.0);
        radar.verificarVelocidade("CAMINHÃO", 115.0, 100.0);
    }
}
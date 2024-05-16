
public class Radar {

    public void verificarVelocidade (String veiculo , double velocidadeVeiculo, double velocidadePermitida) {

        double velVerificadaCaminhao = (velocidadePermitida + (velocidadePermitida * 0.05));
        double velVerificadaCarro = (velocidadePermitida + (velocidadePermitida * 0.10));

        if(veiculo.equalsIgnoreCase("caminhão") && (velocidadeVeiculo < velVerificadaCaminhao)){
            System.out.println("Velocidade dentro do permitido");
        } else if (veiculo.equalsIgnoreCase("carro") && (velocidadeVeiculo < velVerificadaCarro)) {
            System.out.println("Velocidade dentro do permitido");
        } else{
            System.out.println("Veiculo Multado !");
        };

    }
}

package Infraestrutura;

public class Estrada implements ViaDeAcesso {
    private String materialPavimento;
    private int limiteVelocidade;
    private boolean ehMaoDupla;

    public Estrada(String materialPavimento, int limiteVelocidade, boolean ehMaoDupla) {
        this.materialPavimento = materialPavimento;
        this.limiteVelocidade = limiteVelocidade;
        this.ehMaoDupla = ehMaoDupla;
    }

    public void mudarSentidoMaoDupla() {
        this.ehMaoDupla = !this.ehMaoDupla;
    }

    public void pavimentarTrecho(double metros) {
        System.out.println("Pavimentando " + metros + " metros.");
    }

    @Override
    public boolean liberarTrafego() {
        System.out.println("Trânsito na estrada liberado!");
        return true;
    }
}
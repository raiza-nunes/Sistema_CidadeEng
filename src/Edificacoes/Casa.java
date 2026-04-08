package Edificacoes;
import Infraestrutura.ViaDeAcesso;

public class Casa {
    private String tipoConstrucao;
    private int quantidadeQuartos;
    private boolean possuiGaragem;
    private ViaDeAcesso via;

    public Casa(String tipoConstrucao, int quantidadeQuartos, boolean possuiGaragem, ViaDeAcesso via) {
        this.tipoConstrucao = tipoConstrucao;
        this.quantidadeQuartos = quantidadeQuartos;
        this.possuiGaragem = possuiGaragem;
        this.via = via;
    }

    public void reformarConstrucao(String novoTipo) {
        this.tipoConstrucao = novoTipo;
    }

    public boolean guardarCarroGaragem() {
        return possuiGaragem;
    }
}

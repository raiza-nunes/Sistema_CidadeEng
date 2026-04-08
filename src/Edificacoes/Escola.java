package Edificacoes;
import Infraestrutura.ViaDeAcesso;

public class Escola {
    private String nivelEnsino;
    private int capacidadeAlunos;
    private boolean possuiQuadra;
    private ViaDeAcesso via;

    public Escola(String nivelEnsino, int capacidadeAlunos, boolean possuiQuadra, ViaDeAcesso via) {
        this.nivelEnsino = nivelEnsino;
        this.capacidadeAlunos = capacidadeAlunos;
        this.possuiQuadra = possuiQuadra;
        this.via = via;
    }

    public boolean matricularAluno() {
        if(capacidadeAlunos > 0) {
            capacidadeAlunos--;
            return true;
        }
        return false;
    }

    public void iniciarAnoLetivo() {
        System.out.println("Ano letivo iniciado!");
    }
}

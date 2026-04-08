package Edificacoes;
import Infraestrutura.ViaDeAcesso;
import Infraestrutura.Estrada;

public class Hospital {
    private String nome;
    private String tipoAtendimento;
    private int capacidadePacientes;
    private boolean emFuncionamento;
    private ViaDeAcesso via;

    public Hospital(String nome, String tipoAtendimento, int capacidadePacientes, boolean emFuncionamento, ViaDeAcesso via) {
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
        this.capacidadePacientes = capacidadePacientes;
        this.emFuncionamento = emFuncionamento;
        this.via = via;
    }

    public void alterarStatusFuncionamento(boolean status) {
        this.emFuncionamento = status;
    }

    public int verificarVagasDisponiveis() {
        return capacidadePacientes;
    }

    public void enviarAmbulancia(Estrada estrada, String destino) {
        System.out.println("Hospital preparando ambulância para: " + destino);
        if(estrada.liberarTrafego()) {
            System.out.println("Ambulância a caminho!");
        } else {
            System.out.println("Estrada bloqueada.");
        }
    }
}

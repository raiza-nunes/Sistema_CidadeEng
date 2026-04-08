import Infraestrutura.Estrada;
import Edificacoes.Hospital;
import Edificacoes.Casa;

public class Main {
    // Aqui é o ponto de partida!
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DA CIDADE INICIADO ---\n");

        // 1. Criando a Estrada
        Estrada ruaPrincipal = new Estrada("Asfalto", 60, true);

        // 2. Criando as Edificações
        Casa minhaCasa = new Casa("Alvenaria", 3, true, ruaPrincipal);
        Hospital hospitalCentral = new Hospital("Central", "Geral", 100, true, ruaPrincipal);

        // Isso vai fazer o aviso "minhaCasa is never used" desaparecer!
        if (minhaCasa.guardarCarroGaragem()) {
            System.out.println("A casa tem garagem e o carro está guardado.");
        }

        // 3. Ação do Hospital
        System.out.println("\nVagas no hospital: " + hospitalCentral.verificarVagasDisponiveis());
        hospitalCentral.enviarAmbulancia(ruaPrincipal, "Casa 102");
    }
}

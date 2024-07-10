package ios;

import componentes.AparelhoTelefonico;
import componentes.NavegadorDeInternet;
import componentes.ReprodutorMusical;

public class SistemaIOS implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {




    // Implementação da interface aparelho telefônico.

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero );
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Abrindo correio de voz...");
    }

    // Implementação da interface navegador de internet.
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);

    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    // Implementação da interface reprodutor musical.
    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
    System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica " + musica);
    }
}

import ios.SistemaIOS;

public class Iphone {
    public static void main(String[] args) {

        SistemaIOS iphone7 = new SistemaIOS();

        System.out.println("Reprodutor musical:");

        iphone7.selecionarMusica("Beethoven");
        iphone7.tocar();
        iphone7.pausar();

        System.out.println("Aparelho telefônico:");

        iphone7.ligar("XX-XXX-XXX");
        iphone7.atender();
        iphone7.iniciarCorreioDeVoz();

        System.out.println("Navegador de internet:");

        iphone7.exibirPagina("www.google.com");
        iphone7.adicionarAba();
        iphone7.atualizarPagina();

    }
}
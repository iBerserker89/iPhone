package funcionalidade.smartfone;

import funcionalidade.internet.NavegadorInternet;
import funcionalidade.musica.ReprodutorMusical;
import funcionalidade.telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para número " + numero);   
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }
    
}

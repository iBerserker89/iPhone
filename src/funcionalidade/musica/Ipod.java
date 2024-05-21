package funcionalidade.musica;

public class Ipod implements ReprodutorMusical {
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
}

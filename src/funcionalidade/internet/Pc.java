package funcionalidade.internet;

public class Pc implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}

package usuario_final;
import funcionalidade.smartfone.IPhone;

public class Usuario {
    public static void main(String[] args) {
        IPhone testing = new IPhone();

        // Navegador
        testing.exibirPagina("google.com.br");
        testing.adicionarNovaAba();
        testing.atualizarPagina();
        // Music player
        testing.tocar();
        testing.pausar();
        testing.selecionarMusica("Faixa 04");
        // Phone
        testing.ligar("9995656523");
        testing.atender();
        testing.iniciarCorreioVoz();
    }
}

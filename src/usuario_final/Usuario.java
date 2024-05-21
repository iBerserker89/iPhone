package usuario_final;

import funcionalidade.internet.NavegadorInternet;
import funcionalidade.musica.ReprodutorMusical;
import funcionalidade.telefone.AparelhoTelefonico;
import funcionalidade.smartfone.IPhone;

public class Usuario {
    public static void main(String[] args) {
        IPhone testing = new IPhone();

        NavegadorInternet safari = testing;
        ReprodutorMusical itunes = testing;
        AparelhoTelefonico iphone = testing;

        safari.exibirPagina("google");
        itunes.tocar();
        iphone.ligar("9995656523");
    }
}

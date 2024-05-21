package funcionalidade.telefone;

public class Telefone implements AparelhoTelefonico {
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


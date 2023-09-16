public class Iphone  implements AparelhoTelefonico, NavegadorInternet,ReprodutorMusical {

    private String modelo;
    private int armazenamento;
    private int bateria;

    public Iphone(String modelo, int armazenamento, int bateria) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.bateria = bateria;
    }

    public void ligar() {
        // Implementação para ligar o iPhone
    }

    public void desligar() {
        // Implementação para desligar o iPhone
    }

    @Override
    public void fazerChamada() {

    }

    @Override
    public void receberChamada() {

    }

    @Override
    public void enviarMensagem() {

    }

    @Override
    public void reproduzirMusica() {

    }

    @Override
    public void pausarMusica() {

    }

    @Override
    public void ajustarVolume() {

    }

    @Override
    public void abrirPaginaWeb() {

    }

    @Override
    public void fecharPaginaWeb() {

    }

    @Override
    public void navegarHistorico() {

    }
}

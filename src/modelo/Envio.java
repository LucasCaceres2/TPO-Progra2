package modelo;

public class Envio {
    String inicio;
    String destino;
    EstadoEnvio estado;

    public Envio(String inicio, String destino, EstadoEnvio estado) {
        this.inicio = inicio;
        this.destino = destino;
        this.estado = estado;
    }
}

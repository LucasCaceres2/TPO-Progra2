package modelo;

public class Pedido {
    private int idPedido;
    public int idCliente;
    private int fecha;
    TipoPedido tipoPedido;
    int cantidadProductos;
    EstadoPedido estado;
    private String direccionEnvio;

    public Pedido(int idPedido, int idCliente, int fecha, TipoPedido tipoPedido, int cantidadProductos, EstadoPedido estado, String direccionEnvio) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.tipoPedido = tipoPedido;
        this.cantidadProductos = cantidadProductos;
        this.estado = estado;
        this.direccionEnvio = direccionEnvio;
    }
}

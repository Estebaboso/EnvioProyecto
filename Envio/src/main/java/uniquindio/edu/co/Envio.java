package uniquindio.edu.co;

public abstract class Envio {

    private int codigo;
    private double peso;
    private String destino;
    private Destinatario destinatario;
    private TipoEnvio tipoEnvio;
    public EstadoEnvio EstadoEnvio;

    public Destinatario theDestinarioRemitente;
    public Envio theCiudadEnvioOrigen;
    public Envio theCiudadEnvioDestino;

    public Envio(int codigo, double peso, String destino,
                 Destinatario destinatario, TipoEnvio tipoEnvio, EstadoEnvio EstadoEnvio) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.EstadoEnvio = EstadoEnvio;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public Destinatario getDestinatario() { return destinatario; }
    public void setDestinatario(Destinatario destinatario) { this.destinatario = destinatario; }

    public TipoEnvio getTipoEnvio() { return tipoEnvio; }
    public void setTipoEnvio(TipoEnvio tipoEnvio) { this.tipoEnvio = tipoEnvio; }

    public Destinatario getTheDestinarioRemitente() {
        return theDestinarioRemitente;
    }

    public void setTheDestinarioRemitente(Destinatario theDestinarioRemitente) {
        this.theDestinarioRemitente = theDestinarioRemitente;
    }
}
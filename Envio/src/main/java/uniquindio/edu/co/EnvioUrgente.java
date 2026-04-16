package uniquindio.edu.co;

public class EnvioUrgente extends Envio {

    private double recargo;

    public EnvioUrgente(int codigo, double peso, String destino,
                        Destinatario destinatario, TipoEnvio tipoEnvio,
                        double recargo) {
        super(codigo, peso, destino, destinatario, tipoEnvio);
        this.recargo = recargo;
    }

    public double getRecargo() { return recargo; }
    public void setRecargo(double recargo) { this.recargo = recargo; }
}
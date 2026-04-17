package uniquindio.edu.co;

public class EnvioUrgente extends Envio {

    private double recargo;

    public EnvioUrgente(int codigo, double peso, String destino,
                        Destinatario destinatario,
                        double recargo) {
        super(codigo, peso, destino, destinatario);
        this.recargo = recargo;
    }
    public double calcularCostoEnvio(){
        return recargo + (getPeso() + get);
    }

    public double getRecargo() { return recargo; }
    public void setRecargo(double recargo) { this.recargo = recargo; }
}
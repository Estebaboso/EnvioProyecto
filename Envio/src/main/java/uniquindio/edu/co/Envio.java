package uniquindio.edu.co;

public abstract class Envio {

    private int codigo;
    private double peso;
    private String destino;
    private Destinatario destinatario;


    public Envio(int codigo, double peso, String destino,
                 Destinatario destinatario) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
        this.destinatario = destinatario;

    }
    public abstract double calcularCostoEnvio();

    public double calcularCiudad(String destino){
        double precio = 0;
        if(destino.equals("BOGOTA")||destino.equals("MEDELIIN")||destino.equals("CALI")){
        } precio = 5000;

        return precio;
    }
    public double calcularPais(String destino){
        double precio = 0;
        double salida = 0;
        if(destino.equals("MEXICO")||destino.equals("CHILE")||destino.equals("URUGUAY")||destino.equals("BRASIL")){
        } precio = 15000;
        salida = 2000;

        return precio + salida;
    }


    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public Destinatario getDestinatario() { return destinatario; }
    public void setDestinatario(Destinatario destinatario) { this.destinatario = destinatario; }


}
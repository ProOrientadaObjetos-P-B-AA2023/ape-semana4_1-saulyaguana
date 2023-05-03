public class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorChque;
    private double comisionBanco;

    public Cheque() {}

    public Cheque(String nombreCliente, String nombreBanco, double valorChque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorChque = valorChque;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValorChque(double valorChque) {
        this.valorChque = valorChque;
    }

    public void calcularComision() {
        this.comisionBanco = this.valorChque * 0.00003;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValorChque() {
        return valorChque;
    }

    public double getComisionBanco() {
        return  comisionBanco;
    }

    public String ToString() {
        return String.format("CHEQUE\n"
        +"\nNombre Cliente: %s"
        +"\nNombre Banco: %s"
        +"\nValor Chque: %.2f"
        +"\nComisión Banco: %.2f"
        , this.getNombreCliente(), this.getNombreBanco(), this.getValorChque(), this.getComisionBanco());
    }
}

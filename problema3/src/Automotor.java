public class Automotor {
    private String cedulaDueno;
    private String marca;
    private int annioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {}

    public Automotor(String cedula, String marca, int annioFab, double valorVehiculo) {
        this.cedulaDueno = cedula;
        this.marca = marca;
        this.annioFabricacion = annioFab;
        this.valorVehiculo = valorVehiculo;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnnioFabricacion(int annioFab) {
        this.annioFabricacion = annioFab;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularMatricula() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * this.annioFabricacion;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        return String.format("AUTOMOTOR\n"
        +"\nCédula Dueño: %s"
        +"\nMarca: %s"
        +"\nAño Fabricación: %d"
        +"\nValor Vehículo: %.2f"
        +"\nValor Matrícula: %.2f"
        , this.getCedulaDueno(), this.getMarca(), this.getAnnioFabricacion(), this.getValorVehiculo(), this.getValorMatricula());
    }
}

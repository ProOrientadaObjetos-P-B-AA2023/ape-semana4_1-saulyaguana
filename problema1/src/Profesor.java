public class Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor() {}

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void calcularSueldo() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.2);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public String toString() {
        return String.format("PROFESOR\n"
        + "\nNombre: %s"
        + "\nApellido: %s"
        + "\nSueldo Básico: %.2f"
        + "\nCédula: %s"
        + "\nSueldo Total: %.sf"
        , this.getNombre(), this.getApellido(), this.getSueldoBasico(), this.getCedula(), this.getSueldoTotal());
    }
}

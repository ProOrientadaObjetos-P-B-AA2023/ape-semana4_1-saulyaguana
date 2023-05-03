public class Ejecutor {
    public static void main(String[] args) {
        Profesor pf = new Profesor("Edgar", "Allan", 270, "1150666582");
        pf.calcularSueldo();
        System.out.println(pf);
    }
}

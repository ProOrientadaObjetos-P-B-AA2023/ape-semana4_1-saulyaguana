public class Ejecutor {
    public static void main(String[] args) {
        Automotor aut = new Automotor("115066658-2", "Tesla", 2025, 40000);
        aut.calcularMatricula();
        System.out.println(aut);

    }
}

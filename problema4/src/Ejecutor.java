public class Ejecutor {
    public static void main(String[] args) {
        Cheque ch = new Cheque("Ad", "Banco", 245);
        ch.calcularComision();
        System.out.println(ch);

    }
}

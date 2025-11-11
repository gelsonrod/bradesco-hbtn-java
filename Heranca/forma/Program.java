public class Program {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new FormaGeometrica();

        try {
            System.out.printf("Area: %d", (int)formaGeometrica.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

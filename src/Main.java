public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo();
        double risultatoRettangolo = rettangolo.calcolaArea(5,5);

        Triangolo triangolo = new Triangolo();
        double risultatoTriangolo = triangolo.calcolaArea(9.0,15.0);

        System.out.println("Area Rettangolo: " + risultatoRettangolo);
        System.out.println("Area Triangolo: " + risultatoTriangolo);
    }
}
public class Rettangolo extends Forma{

    double base;
    double altezza;

    public void calcolaArea(double a, double b){
        double area = a * b;

        System.out.println("L'area di un rettangolo è: " + area);
    }
}

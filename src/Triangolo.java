public class Triangolo extends Forma{

    double base;
    double altezza;

    public void calcolaArea(double a, double b){
        double area = (a * b)/2;

        System.out.println("L'area di un triangolo è: " + area);
    }
}

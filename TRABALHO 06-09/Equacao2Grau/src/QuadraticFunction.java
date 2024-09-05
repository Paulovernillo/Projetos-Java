public class QuadraticFunction {
    private final double a;
    private final double b;
    private final double c;
    private double x1;
    private double x2;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean obterRaiz(){
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            return false;
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            x1 = (-b / (2 * a));
            x2 = x1;
        }
        return true;
    }
}

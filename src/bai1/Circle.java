package bai1;

public class Circle {
    private double R;

    protected double PI = Math.PI;
    public Circle() {
    }

    public Circle(double r) {
        R = r;
    }

    public double chuVi(){
        return 2*R*PI;
    }

    public double dienTich(){
        return R*R*PI;
    }
    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                "chu vi = " + chuVi() +
                "dien tic = " + dienTich() +
                '}';
    }
}

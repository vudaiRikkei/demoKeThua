package bai1;

public class Cylinder extends Circle{
    private double h;

    @Override
    public double chuVi() {
        return super.chuVi()*2;
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public double dienTichToanPhan() {
        return super.dienTich()*2 + super.chuVi()*h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double theTich(){
        return super.dienTich()*h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                ", chiều cao: " + h +
                ", bán kính đáy: " + super.getR() +
                ", diện tích đáy: " + super.dienTich() +
                ", chu vi đáy: " + super.chuVi() +
                ", chu vi: " + this.chuVi() +
                ", diện tích toàn phần: " + this.dienTichToanPhan() +
                ", thể tích: " + this.theTich() +
                '}';
    }
}

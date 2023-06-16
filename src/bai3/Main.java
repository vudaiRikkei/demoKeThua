package bai3;

public class Main {
    public static void main(String[] args) {
//Point point = new Point(5, 6);
//        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(5, 6, 10,10);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

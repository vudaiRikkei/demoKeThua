package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập cạnh a");
        double a = Double.parseDouble(sc.nextLine());
        triangle.setSide1(a);
        System.out.println("mời bạn nhập cạnh b");
        double b = Double.parseDouble(sc.nextLine());
        triangle.setSide2(b);
        System.out.println("mời bạn nhập cạnh c");
        double c = Double.parseDouble(sc.nextLine());
        triangle.setSide3(c);
        System.out.println("Mời bạn nhập màu của tam giác: ");
        String h = sc.nextLine();
        triangle.setColor(h);
        System.out.printf(triangle.toString());
    }
}
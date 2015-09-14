import java.lang.*;

/**
 * Created by 111 on 14.09.2015.
 */


public class ImagineNumber extends Number {
    private Double rx, iy;

    ImagineNumber(Double rx, Double iy) {
        this.rx = rx;
        this.iy = iy;
    }

    @Override
    public void addition(Number a, Number b) {
        int add = a.getX(a) + b.getX(b);
        int add1 = a.getIy(a) + b.getIy(b);
        System.out.println("The result of addition is " + add + '+' + 'i' + add1);
    }

    @Override
    public void subsctruction(Number a, Number b) {
        int sub = a.getX(a) - b.getX(b);
        int sub1 = a.getIy(a) - b.getIy(b);
        System.out.println("The result of addition is " + sub + '+' + 'i' + sub1);
    }

    @Override
    public void multiplication(Number a, Number b) {
        int mul1 = a.getX(a) * b.getX(b) - a.getIy(a) * b.getIy(b);
        int mul2 = a.getX(a) * b.getIy(b) + a.getIy(a) * b.getIy(b);
        System.out.println("The result of multiplication is " + mul1 + '+' + 'i' + mul1);

    }

    @Override
    public void division(Number a, Number b) {
        int div1 = a.getX(a) / b.getX(b) - a.getIy(a) / b.getIy(b);
        int div2 = a.getX(a) / b.getIy(b) + a.getX(a) / b.getIy(b);
        System.out.println("The result of division is " + div1 + '+' + 'i' + div2);
    }

//  main предлагаю вынести в отдельный класс, в котором можно будет посмотреть весь функционал для всех классов.

//    public static void main(String argv[]) {
//        Number a = new ImagineNumber();
//        Number b = new ImagineNumber();
//        a.setX(14);
//        a.setIy(88);
//        b.setX(14);
//        b.setIy(88);
//
//
//        a.addition(a, b);
//    }

    public Double getRx() {
        return rx;
    }

    public Double getIy() {
        return iy;
    }
}

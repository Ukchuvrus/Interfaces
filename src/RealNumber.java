/**
 * Created by 111 on 14.09.2015.
 */
public class RealNumber extends Number {
    // зачем iy тут?
    // кстати, не забывай про CamelCase.
    private Double rx;

    @Override
    public void addition(Number a, Number b) {
        int add = a.getX(a) + b.getX(b);
        System.out.println("The result of addition is " + add);

    }

    @Override
    public void subsctruction(Number a, Number b) {
        int add = a.getX(a) - b.getX(b);
        System.out.println("The result of substruction is " + add);
    }

    @Override
    public void multiplication(Number a, Number b) {
        int add = a.getX(a) * b.getX(b);
        System.out.println("The result of substruction is " + add);
    }

    @Override
    public void division(Number a, Number b) {
        int add = a.getX(a) * b.getX(b);
        System.out.println("The result of division is " + add);
    }

    @Override
    public int getX(Number a) {
        return rx;
    }

    @Override
    public void setX(int a) {
        rx = a;
    }

    //  main предлагаю вынести в отдельный класс, в котором можно будет посмотреть весь функционал для всех классов.

//    public static void main(String argv[]) {
//        Number a = new RealNumber();
//        Number b = new RealNumber();
//        a.setX(14);
//        b.setX(88);
//        a.addition(a, b);
//
//    }
}

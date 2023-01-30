public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        Integer a = calc.plus.apply(1, 2);
        Integer b = calc.minus.apply(1,1);
        Integer c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}

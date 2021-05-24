package test;

public class tcalc {
    public static int calculate(Number a, Number b, String op) throws Exception {
        int result;
        switch (op) {
            case "+": result = a.intValue() + b.intValue();
                break;
            case "-": result = a.intValue() - b.intValue();
                break;
            case "*": result = a.intValue() * b.intValue();
                break;
            case "/": result = a.intValue() / b.intValue();
                break;
            default:
                throw new Exception("можно использовать только символы +,-,*,/");
        }
        if (result < 1) throw new Exception();

        return result;
    }
}

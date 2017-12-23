public class Main {
    public static void main(String[] args)throws  ArithmeticExceptoin {
        Expression i;
        i = new Divide(new Multiply(new Variable('x'), new Variable('y')), new Constant(2));
        System.out.println(i.evaluate(1,2,2));
    }
}

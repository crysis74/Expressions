public class Main {
    public static void main(String[] args) {
        Expression i;
        i = new Sum(new Variable('x'), new Sum(new Variable('y'),new Constant(2)));
        System.out.println(i.evaluate(1,2,2));
    }
}

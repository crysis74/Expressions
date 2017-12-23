public class Sqr extends Unary {

    public Sqr(Expression per1) {

        super(per1);

    }
    public int result(int first) throws ArithmeticExceptoin {

        return (int)Math.pow(first);

    }
}

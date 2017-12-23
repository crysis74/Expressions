    public class UnaryMinus  extends Unary {

    public UnaryMinus(Expression per1) {

        super(per1);

    }
    public int result(int first) throws ArithmeticExceptoin {

        return  - first;

    }
}

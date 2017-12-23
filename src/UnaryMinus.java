    public class UnaryMinus  extends Operation {

    public UnaryMinus(Expression per1) {

        super(per1);

    }
    public int evaluate(int x, int y, int z) throws ArithmeticExceptoin {

        return  - (per1.evaluate(x, y, z));

    }
}

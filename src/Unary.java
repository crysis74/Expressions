public abstract class Unary implements Expression {

    protected Expression per1;

    public Unary(Expression per1) {

        this.per1 = per1;
    }
    public  int evaluate(int x, int y, int z) {

        int first = per1.evaluate(x, y, z);
        return result(first);

    };
    protected abstract int result(int first) throws ArithmeticExceptoin ;


}

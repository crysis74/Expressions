public abstract class Operation implements Expression {

    protected Expression per1;

    public Operation(Expression per1) {

        this.per1 = per1;
    }

    public abstract int evaluate(int x, int y, int z) throws ArithmeticExceptoin;
}

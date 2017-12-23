public abstract class Binary extends Unary {

    protected Expression per2;

    public Binary(Expression per1, Expression per2) {

        super(per1);
        this.per2 = per2;
    }
    public abstract int evaluate(int x, int y, int z) throws ArithmeticExceptoin;
}

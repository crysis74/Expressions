public abstract class Binary  {

    protected Expression per1;
    protected Expression per2;

    public Binary(Expression per1, Expression per2) {

        this.per1 = per1;
        this.per2 = per2;
    }
    public abstract int evaluate(int x, int y, int z) throws ArithmeticExceptoin;
}

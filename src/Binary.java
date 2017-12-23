public abstract class Binary implements Expression {

    protected Expression per1;
    protected Expression per2;

    public Binary(Expression per1, Expression per2) {

        this.per1 = per1;
        this.per2 = per2;
    }


    public  int evaluate(int x, int y, int z) {

        int first = per1.evaluate(x, y, z);
        int second = per2.evaluate(x, y, z);
        return result(first , second);

    };
    protected abstract int result(int first, int second) throws ArithmeticExceptoin;
}

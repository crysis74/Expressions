public abstract class Unary implements Expression {

    protected Expression per1;

    public Unary(Expression per1) {

        this.per1 = per1;
    }

    
    public abstract int evaluate(int x, int y, int z) throws ArithmeticExceptoin;
}
